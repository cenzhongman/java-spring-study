package com.cenzhongman.spring.p03DataFromWebService;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class DataFromWebService {
    /**
     * 从一个请求中将数据存储成JavaBean
     */

    @Autowired
    private RestTemplate restTemplate;

    public void test(){
        JsonObject json = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",JsonObject.class);
        System.out.println(json);
    }
}
