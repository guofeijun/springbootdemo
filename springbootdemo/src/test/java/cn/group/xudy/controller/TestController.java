package cn.group.xudy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping(value = "/test")
    public String Test(String tt){

        return tt;
    }
}
