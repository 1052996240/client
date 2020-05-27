package com.example.demo.service;

import com.example.demo.dao.mapperdao1.UpresourcesMapper;
import com.example.demo.entity.Report;
import com.example.demo.entity.Upresources;
import com.example.demo.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2020/5/22.
 */
@Service
public class UpresourcesServiceImpl {
    @Autowired
    UpresourcesMapper upresourcesMapper;

    @Autowired
    ReportServiceImpl reportService;

    /**
     *存放文件地址
     * @param path  存放地址
     * @param leixing  (视频为S，图片为T)
     */
    public synchronized void insertUpre(String path,String leixing) {
        String waterNumber = (String) SessionUtil.getSessionAttribute("waterNumber");
        Upresources upresources = new Upresources();
        upresources.setS002(waterNumber);
        upresources.setS003(path);
        upresources.setS004(leixing);
        if (reportService.eqCunZhai(waterNumber)) {
            Report report = new Report();
            report.setR050("0");
            reportService.repairs(report);
        }
        upresourcesMapper.insertSelective(upresources);
    }

}
