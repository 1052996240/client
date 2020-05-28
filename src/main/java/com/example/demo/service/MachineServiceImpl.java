package com.example.demo.service;

import com.example.demo.dao.mapperdao1.EuserMapper;
import com.example.demo.dao.mapperdao1.MachineMapper;
import com.example.demo.entity.Euser;
import com.example.demo.util.CommonUtil;
import com.example.demo.util.SessionUtil;
import com.example.demo.util.UrlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 机器信息
 * Created by admin on 2020/5/7.
 */
@Service
public class MachineServiceImpl {

    @Autowired
    ReportServiceImpl reportService;

    @Autowired
    UserDetailServiceImpl userDetailService;


    /**
     * 获取corpAccessToken和corpId
     *
     * @return
     */
    public Map<String, Object> getCorpAccessTokenAndcorpId() {
        String url = "https://open.fxiaoke.com/cgi/corpAccessToken/get/V2";
        HashMap<String, Object> shehzi = new HashMap<>();
        shehzi.put("appId", "FSAID_1318e89");
        shehzi.put("appSecret", "fe250ba442b743b9a535c01e107d92d4");
        shehzi.put("permanentCode", "ED5C915380567DDAB30662D96960D5E5");
        return UrlUtil.postRequets(url, shehzi);
    }


    /**
     * 获取客户信息
     *
     * @param corpAccessToken
     * @param corpId
     * @param customer
     * @return
     */
    public Map<String, Object> getCustomerData(Object corpAccessToken, Object corpId, String customer) {
        String url = "https://open.fxiaoke.com/cgi/crm/v2/data/get";
        HashMap<String, Object> shehzi = new HashMap<>();
        HashMap<String, Object> data = new HashMap<>();
        shehzi.put("corpAccessToken", corpAccessToken);
        shehzi.put("corpId", corpId);
        shehzi.put("currentOpenUserId", "FSUID_6FB117D16DA78EB26B14A72178E25D2B");
        data.put("dataObjectApiName", "AccountObj");
        data.put("objectDataId", customer);
        shehzi.put("data", data);
        return UrlUtil.postRequets(url, shehzi);
    }

    /**
     * 获取机器的信息
     *
     * @param m001 机器编号  CRM对应的
     * @return
     */
    public Map<String, Object> getMachineInformation(String m001) {
        String url = "https://open.fxiaoke.com/cgi/crm/custom/data/get";
        Map<String, Object> corpAccessTokenAndcorpId = getCorpAccessTokenAndcorpId();
        String corpAccessToken = (String) corpAccessTokenAndcorpId.get("corpAccessToken");
        String corpId = (String) corpAccessTokenAndcorpId.get("corpId");
        HashMap<String, Object> shehzi = new HashMap<>();
        HashMap<String, Object> data = new HashMap<>();
        shehzi.put("corpAccessToken", corpAccessToken);
        shehzi.put("corpId", corpId);
        shehzi.put("currentOpenUserId", "FSUID_6FB117D16DA78EB26B14A72178E25D2B");
        data.put("dataObjectApiName", "object_e81el__c");
        data.put("objectDataId", m001);
        shehzi.put("data", data);
        Map<String, Object> machineInformation = UrlUtil.postRequets(url, shehzi);
        Map<String, Object> data1 = (Map) machineInformation.get("data");
        Map<String, Object> customerData = getCustomerData(corpAccessToken, corpId, (String) data1.get("field_z706W__c"));
        Map<String, String> data2 = (Map) customerData.get("data");
        machineInformation.put("city__r", data2.get("city__r"));
        machineInformation.put("district__r", data2.get("district__r"));
        machineInformation.put("baoxiudata", CommonUtil.getZhuanHuanData((Long) data1.get("field_ATcjj__c")));
        machineInformation.put("chuchangdata", CommonUtil.getZhuanHuanData((Long) data1.get("field_S19rF__c")));
        if (SessionUtil.getSessionAttribute("m001") != null && !SessionUtil.getSessionAttribute("m001").equals(m001)) {
            SessionUtil.removeSessionAttribute("waterNumber");
        }
        if (SessionUtil.getSessionAttribute("waterNumber") == null) {
            SessionUtil.setSessionAttribute("waterNumber", reportService.getWaterNumber());
        } else {
            if (reportService.eqCommit((String) SessionUtil.getSessionAttribute("waterNumber"))) {
                SessionUtil.setSessionAttribute("waterNumber", reportService.getWaterNumber());
            }
        }
        String u001 = (String) SessionUtil.getSessionAttribute("U001");//登录人的账户
        Euser euser = userDetailService.getEuser(u001);
        machineInformation.put("name", euser.getU003());//账号人姓名
        machineInformation.put("phone", euser.getU007());//账号人的联系方式
        SessionUtil.setSessionAttribute("m001", m001);
        return machineInformation;
    }


}
