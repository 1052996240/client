package com.example.demo.controller;

import com.example.demo.service.MachineServiceImpl;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 机器信息
 * Created by admin on 2020/5/8.
 */
@Controller
@RequestMapping("/machine")
@Slf4j
public class MachineController {

//    private final Logger log= LoggerFactory.getLogger(MachineController.class);
    @Autowired
    MachineServiceImpl machineService;

    @RequestMapping("/")
    public Object machine() {
        return "machine/machine";
    }

    /**
     * 传机器id返回信息，传入机器id错误时返回message=1
     * @param m001
     * @return
     */
    @ResponseBody
    @RequestMapping("/getMachineInformation/{m001}")
    public Object getMachineInformation(@PathVariable String m001) {
        log.info("获取机器信息...");
        return machineService.getMachineInformation(m001);
    }
}
