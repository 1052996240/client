package com.example.demo;

import com.example.demo.dao.mapperdao1.EuserMapper;
import com.example.demo.entity.Euser;
import com.example.demo.service.MachineServiceImpl;
import com.example.demo.service.ReportServiceImpl;
import com.example.demo.util.QRcodeUtil;
import com.example.demo.util.UrlUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DemoApplicationTests {

	@Autowired
	EuserMapper userMapper;

	@Autowired
	MachineServiceImpl machineService;

	@Autowired
	ReportServiceImpl reportService;

	@Test
	public void contextLoads() {
		String waterNumber = reportService.getWaterNumber();
		System.out.println(waterNumber);
//		Map<String, String> machineInformation = machineService.getMachineInformation("5ec330d483ef2e00016082b9");
//		System.out.println(machineInformation);


//		String url = "https://open.fxiaoke.com/cgi/corpAccessToken/get/V2";
//		HashMap<String, String> shehzi = new HashMap<>();
//		shehzi.put("appId", "FSAID_1318e89");
//		shehzi.put("appSecret", "fe250ba442b743b9a535c01e107d92d4");
//		shehzi.put("permanentCode", "ED5C915380567DDAB30662D96960D5E5");
//		Map<String, String> stringStringMap = UrlUtil.postRequets(url, shehzi);
//		System.out.println(stringStringMap);

//		QRcodeUtil.creatRrCode2("https://blog.csdn.net/qq_34309305/article/details/69257538",200,200);

//		Euser user = new Euser();
//		user.setU001("admin");
//		user.setU002("123456");
//		user.setU003("郭文笛");
//		user.setU004("1");
//		user.setU005("IT信息部");
//		user.setU006("ROLE_admin");
////		userMapper.insertSelective(user);
//		userMapper.updateByPrimaryKey(user);
//		System.out.println(user);
	}

}
