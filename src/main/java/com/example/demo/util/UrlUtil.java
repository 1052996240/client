package com.example.demo.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by admin on 2020/5/4.
 */
public class UrlUtil {
    /**
     * @param o 封装的传过去的数据，可用类的对象
     * 访问post请求的的接口
     */
    public static Map<String,Object> postRequets(String url,Object o) {
        RestTemplate restTemplate=new RestTemplate();
        ResponseEntity<Map> responseEntity=restTemplate.postForEntity(url,o,Map.class); //提交的body内容为user对象，请求的返回的body类型为String
        Map<String,Object> body = responseEntity.getBody();
        return body;
    }

    /**
     * 访问get请求的接口
     * @param url
     * @param params 封装传过去的数据
     */
    public static Object getAudit(String url, Map<String, String> params) {

//        String uu = "http://192.168.0.7:8099/TSrvMethods/CallTransManager?ProID={ProId}&CompanyId={CompanyId}&UserId={UserId}&TODO={TODO}&SlipType={SlipType}&SlipCode={SlipCode}&TransDate={TransDate}";
        // http://USER-SERVICE/user?name={name)
        RestTemplate restTemplate = new RestTemplate();
//        Map<String,String> params=new HashMap<>();
//        params.put("name","dada");  //
        return restTemplate.getForEntity(url, String.class, params).getBody();//提交的是map类型，返回字符串
    }
}
