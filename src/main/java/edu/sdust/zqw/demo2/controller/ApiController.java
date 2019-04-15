package edu.sdust.zqw.demo2.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("api/v1/clients")
    public int Test(@RequestBody String str) {
        System.out.println(str);
        System.out.println("收到client！");
        return 0;
    }
    @RequestMapping("api/v1/streams")
    public int Test2(@RequestBody String str) {
        System.out.println(str);
        System.out.println("收到streams！");
        return 0;
    }
    @RequestMapping("api/v1/sessions")
    public int Test3(@RequestBody String str) {
        System.out.println(str);
        System.out.println("收到session！");
        return 0;
    }
}
