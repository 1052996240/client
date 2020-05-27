package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Report;
import com.example.demo.service.ReportServiceImpl;
import com.example.demo.service.UpresourcesServiceImpl;
import com.example.demo.util.Message;
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


    /**
     * 提交成功后返回message=1
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
        String pathname = "D:\\file\\" + filenames;
        file.transferTo(new File(pathname));
        resUrl.put("src", pathname);
        res.put("msg", "");
        res.put("code", 0);
        res.put("data", resUrl);
        upresourcesService.insertUpre(pathname,"S");
        return res;
    }

    /**
     *上传图片
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping(value="/relgoods/images")
    @ResponseBody
    public JSONObject relgoodsimages(@RequestParam(value = "file", required = false) MultipartFile[] file) throws IOException {
        log.info("上传图片...");
        JSONObject res = new JSONObject();
        JSONObject resUrl = new JSONObject();
        List<String> imageurls=new ArrayList<>();
        for (MultipartFile files:file){
            String filename = UUID.randomUUID().toString().replaceAll("-", "");
            String ext = FilenameUtils.getExtension(files.getOriginalFilename());
            String filenames = filename + "." + ext;
            String pathname = "D:\\file\\" + filenames;
            files.transferTo(new File(pathname));
            imageurls.add(pathname);
            res.put("msg", "");
            res.put("code", 0);
            upresourcesService.insertUpre(pathname,"T");
        }
        resUrl.put("src", imageurls);
        res.put("data", resUrl);
        return res;
    }

}
