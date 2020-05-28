package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Report;
import com.example.demo.entity.Upresources;
import com.example.demo.service.ReportServiceImpl;
import com.example.demo.service.UpresourcesServiceImpl;
import com.example.demo.util.Message;
import com.example.demo.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by admin on 2020/5/18.
 */
@Controller
@RequestMapping("/report")
@Slf4j
public class ReportController {
    @Autowired
    ReportServiceImpl reportService;

    @Autowired
    UpresourcesServiceImpl upresourcesService;

    @RequestMapping("/a")
    public Object report() {
        return "report/report";
    }

    @RequestMapping("/evaluat")
    public Object evaluate() {
        return "report/evaluate";
    }

    /**
     * 提交成功后返回message=1
     *
     * @param report
     * @return
     */
    @ResponseBody
    @PostMapping("/repairs")
    public Object repairs(@RequestBody Report report) {
        log.info("提交信息...");
        return reportService.guzhang(report);
    }

    /**
     * 上传视频
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("/relgoods/video")
    @ResponseBody
    public JSONObject relgoodsvideo(@RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        log.info("上传视频...");
        JSONObject res = new JSONObject();
        JSONObject resUrl = new JSONObject();
        String filename = UUID.randomUUID().toString().replaceAll("-", "");
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String filenames = filename + "." + ext;

        String wenjianjia = "D:\\file\\" + SessionUtil.getSessionAttribute("waterNumber") + "\\video";
        File file1 = new File(wenjianjia);
        if (!file1.exists()) {//如果文件夹不存在
            file1.mkdir();//创建文件夹
        }
        String pathname = wenjianjia + "\\" + filenames;
        file.transferTo(new File(pathname));
        resUrl.put("src", pathname);
        res.put("msg", "");
        res.put("code", 0);
        res.put("data", resUrl);
        upresourcesService.insertUpre(pathname, "S");
        return res;
    }

    /**
     * 上传图片
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/relgoods/images")
    @ResponseBody
    public JSONObject relgoodsimages(@RequestParam(value = "file", required = false) MultipartFile[] file) throws IOException {
        log.info("上传图片...");
        JSONObject res = new JSONObject();
        JSONObject resUrl = new JSONObject();
        List<String> imageurls = new ArrayList<>();
        for (MultipartFile files : file) {
            String filename = UUID.randomUUID().toString().replaceAll("-", "");
            String ext = FilenameUtils.getExtension(files.getOriginalFilename());
            String filenames = filename + "." + ext;

            String wenjianjia = "D:\\file\\" + SessionUtil.getSessionAttribute("waterNumber") + "\\img";
            File file1 = new File(wenjianjia);
            if (!file1.exists()) {//如果文件夹不存在
                file1.mkdir();//创建文件夹
            }
            String pathname = wenjianjia + "\\" + filenames;
            files.transferTo(new File(pathname));
            imageurls.add(pathname);
            res.put("msg", "");
            res.put("code", 0);
            upresourcesService.insertUpre(pathname, "T");
        }
        resUrl.put("src", imageurls);
        res.put("data", resUrl);
        return res;
    }


    /**
     * 返回所有状态不为0的报修表
     *
     * @return
     */
    @RequestMapping("/assigningReport")
    @ResponseBody
    public List<Report> assigningReport() {
        return reportService.assigningReport();
    }


    /**
     * 更新分配任务类型，以及对应人
     *
     * @param report 传流水编号r008，报修类型r047，报修处理人r048（上门维修需要传）
     */
    @RequestMapping("/updataAssigning")
    @ResponseBody
    public void updataAssigning(@RequestBody Report report) {
        reportService.updataAssigning(report);
    }


    /**
     * 上门维修需求 带出所有售后人员
     *
     * @return
     */
    @RequestMapping("/getHandler2")
    @ResponseBody
    public Object getHandler2() {
        return reportService.getHandler2();
    }

    /**
     * 返回图片地址
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/returnImgPath")
    public Object returnImgPath(@RequestBody Map<String, String> map) {
        return reportService.returnImgPath(map.get("r008"));
    }

    /**
     * 返回视频地址
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/returnVideoPath")
    public Object returnVideoPath(@RequestBody Map<String, String> map) {
        return reportService.returnVideoPath(map.get("r008"));
    }


    /**
     * 客户查看自己公司的报修记录
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/clientLookReport")
    public Object clientLookReport() {
        return reportService.clientLookReport();
    }

    /**
     * 服务评价，传r044（服务建议），r045(速度打分)，r046（服务态度打分）
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/evaluate")
    public Object evaluate(@RequestBody Report report) {
        return reportService.evaluate(report);
    }

    /**
     * 通过r008获取报修单
     * @return
     */
    @ResponseBody
    @RequestMapping("/getReportByR008")
    public Object getReportByR008(@RequestBody Map<String,String> map) {
        return reportService.getReportByR008(map.get("r008"));
    }


}
