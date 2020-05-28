package com.example.demo.service;

import com.example.demo.dao.mapperdao1.ReportMapper;
import com.example.demo.dao.mapperdao1.UpresourcesMapper;
import com.example.demo.entity.*;
import com.example.demo.util.CommonUtil;
import com.example.demo.util.Message;
import com.example.demo.util.SessionUtil;
import com.example.demo.util.UrlUtil;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 报修信息表
 * Created by admin on 2020/5/12.
 */
@Service
public class ReportServiceImpl {
    @Autowired
    ReportMapper reportMapper;
    @Autowired
    MachineServiceImpl machineService;
    @Autowired
    UserDetailServiceImpl userDetailService;

    @Autowired
    UpresourcesMapper upresourcesMapper;


    /**
     * 提交故障描述的信息
     *
     * @param report
     * @return
     */
    public Object guzhang(Report report) {
        System.out.println(report.getR007());
        if (report == null) {
            return new Message("1");//报修失败
        } else {
            ReportExample reportExample = new ReportExample();
            ReportExample.Criteria criteria = reportExample.createCriteria();
            String waterNumber = (String) SessionUtil.getSessionAttribute("waterNumber");
            criteria.andR008EqualTo(waterNumber);
            if (eqCunZhai(waterNumber)) {
                report.setR050("1");
                repairs(report);
//                report1.setR007();
//                reportMapper.updateByPrimaryKeySelective(report1);
            } else {
                List<Report> reports = reportMapper.selectByExample(reportExample);
                Report report1 = reports.get(0);
                report1.setR007(report.getR007());
                report1.setR050("1");
                reportMapper.updateByPrimaryKeySelective(report1);
            }
            return new Message("0");//报修成功
        }
    }

    /**
     * 插入数据
     *
     * @return
     */
    public synchronized Report repairs(Report report1) {
        Report report = new Report();
        String u004 = (String) SessionUtil.getSessionAttribute("U004");// 此账户的公司id
//        String u006 = (String) SessionUtil.getSessionAttribute("U006");//此账户的权限
        String u001 = (String) SessionUtil.getSessionAttribute("U001");//登录人的账户
        String m001 = (String) SessionUtil.getSessionAttribute("m001");//机器对应CRM的ID
        String waterNumber = (String) SessionUtil.getSessionAttribute("waterNumber");//机器对应CRM的ID
        Map<String, Object> machineInformation = machineService.getMachineInformation(m001);
        Map<String, Object> data = (Map) machineInformation.get("data");
        report.setR016((String) machineInformation.get("city__r"));
        report.setR017((String) machineInformation.get("district__r"));
        report.setR009((String) data.get("_id"));
        report.setR007(report1.getR007());
        report.setR010((String) data.get("field_02D6t__c"));
        report.setR011((String) data.get("field_zi2Ag__c"));
        report.setR012((String) data.get("field_z706W__c"));
        report.setR013(CommonUtil.getZhuanHuanData((Long) data.get("field_ATcjj__c")));
        report.setR014(CommonUtil.getZhuanHuanData((Long) data.get("field_S19rF__c")));
        report.setR015((String) data.get("name"));
        report.setR006(CommonUtil.getNowData());
        report.setR049(CommonUtil.getNowData());
        report.setR001(u004);
        report.setR002(u001);
        report.setR003(m001);
        report.setR008(waterNumber);
        report.setR050(report1.getR050());
        report.setR018(report1.getR018());
        report.setR019(report1.getR019());
        reportMapper.insertSelective(report);
        return report;
    }


    /**
     * 获取唯一性的流水账号（R008）
     *
     * @return
     */
    public String getWaterNumber() {
        String waterNumber;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        String data = df.format(new Date());
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR008Like("%" + data + "%");
        reportExample.setOrderByClause("R008 DESC");
        List<Report> reports = reportMapper.selectByExample(reportExample);
        if (reports != null && reports.size() != 0) {
            long l = Long.parseLong(reports.get(0).getR008());
            l = l + 1;
            waterNumber = l + "";
        } else {
            waterNumber = data + "001";
        }
        return waterNumber;
    }

    /**
     * 判断是否存在数据库
     *
     * @return
     */
    public boolean eqCunZhai(String waterNumber) {
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR008EqualTo(waterNumber);
        List<Report> reports = reportMapper.selectByExample(reportExample);
        if (reports == null || reports.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断当前数据是否提交过
     * @param waterNumber
     * @return
     */
    public boolean eqCommit(String waterNumber) {
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR050EqualTo("1");
        criteria.andR008EqualTo(waterNumber);
        List<Report> reports = reportMapper.selectByExample(reportExample);
        if (reports == null || reports.size() == 0) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * 所有报修表
     * @return
     */
    public List<Report> assigningReport(){
        ReportExample reportExample = new ReportExample();
        reportExample.setOrderByClause("R050 ASC");
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR050NotEqualTo("0");
//        criteria.andR050EqualTo("1");
        List<Report> reports = reportMapper.selectByExample(reportExample);
        return reports;
    }

    /**
     * 返回图片地址
     * @param r008 流水编号
     * @return
     */
    public Object returnImgPath(String r008) {
        UpresourcesExample upresourcesExample = new UpresourcesExample();
        UpresourcesExample.Criteria criteria = upresourcesExample.createCriteria();
        criteria.andS002EqualTo(r008);
        criteria.andS004EqualTo("T");
        List<Upresources> upresources = upresourcesMapper.selectByExample(upresourcesExample);
        if (upresources == null || upresources.size() == 0) {
            return new Message("1");
        }
        return upresources;
    }

    /**
     * 返回视频地址
     * @param r008 流水编号
     * @return
     */
    public Object returnVideoPath(String r008) {
        UpresourcesExample upresourcesExample = new UpresourcesExample();
        UpresourcesExample.Criteria criteria = upresourcesExample.createCriteria();
        criteria.andS002EqualTo(r008);
        criteria.andS004EqualTo("S");
        List<Upresources> upresources = upresourcesMapper.selectByExample(upresourcesExample);
        if (upresources == null || upresources.size() == 0) {
            return new Message("1");
        }
        return upresources;
    }

    /**
     * 更新分配任务类型，以及对应人
     * @param report 传流水编号r008，报修类型r047，(上门报修)报修处理人r048
     */
    public void updataAssigning(Report report) {
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR008EqualTo(report.getR008());
        report.setR050("2");
        report.setR049(CommonUtil.getNowData());
        Euser handler = getHandler(report.getR047());//传类型，返回处理人姓名
        if (handler != null) {
            report.setR048(handler.getU003());
        }
        reportMapper.updateByExampleSelective(report, reportExample);
    }

    /**
     * 传职务，返回处理人姓名
     * @param u008 职务
     * @return
     */
    public Euser getHandler(String u008) {
       return userDetailService.getUserByU008(u008).get(0);
    }

    /**
     * 上门维修需求
     * @return
     */
    public Map<String, Object> getHandler2() {
        String url = "https://open.fxiaoke.com/cgi/user/list";
        HashMap<String, Object> shehzi = new HashMap<>();
        Map<String, Object> corpAccessTokenAndcorpId = machineService.getCorpAccessTokenAndcorpId();
        shehzi.put("corpAccessToken", corpAccessTokenAndcorpId.get("corpAccessToken"));
        shehzi.put("corpId", corpAccessTokenAndcorpId.get("corpId"));
        shehzi.put("departmentId", 1012);
        shehzi.put("fetchChild", false);
        return UrlUtil.postRequets(url, shehzi);
    }

    /**
     * 客户查看自己公司的报修记录
     * @return
     */
    public List<Report> clientLookReport() {
        String u004 = (String) SessionUtil.getSessionAttribute("U004");
        ReportExample reportExample = new ReportExample();
        reportExample.setOrderByClause("R050 ASC");
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR001EqualTo(u004);
        return reportMapper.selectByExample(reportExample);
    }

    /**
     * 服务评价
     * @param report
     * @return
     */
    public Object evaluate(Report report) {
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR008EqualTo(report.getR008());
        reportMapper.updateByExampleSelective(report, reportExample);
        return new Message("0");
    }

    /**
     * 通过r008获取保修单
     * @param r008
     * @return
     */
    public Report getReportByR008(String r008) {
        ReportExample reportExample = new ReportExample();
        ReportExample.Criteria criteria = reportExample.createCriteria();
        criteria.andR008EqualTo(r008);
        return reportMapper.selectByExample(reportExample).get(0);
    }

}
