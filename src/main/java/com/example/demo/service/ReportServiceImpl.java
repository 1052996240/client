package com.example.demo.service;

import com.example.demo.dao.mapperdao1.ReportMapper;
import com.example.demo.entity.Report;
import com.example.demo.entity.ReportExample;
import com.example.demo.util.CommonUtil;
import com.example.demo.util.Message;
import com.example.demo.util.SessionUtil;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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
                repairs(report.getR007(),"1");
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
    public synchronized Report repairs(String r007,String r50) {
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
        report.setR007(r007);
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
        report.setR050(r50);
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

}
