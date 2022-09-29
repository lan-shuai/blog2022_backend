package com.newera.blog.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public JSONObject test(){
        JSONObject obj = new JSONObject();
        obj.put("name", "zhangsan");
        obj.put("age", 20);
        return obj;
    }
}
