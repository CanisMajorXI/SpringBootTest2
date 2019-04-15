package edu.sdust.zqw.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HTMLController {
    @RequestMapping("/hello")
    String getPage(Map<String,Object> paramMap) {
        paramMap.put("name","XiJinPing");
        paramMap.put("age",65);
        return "mypage1";
    }
}
