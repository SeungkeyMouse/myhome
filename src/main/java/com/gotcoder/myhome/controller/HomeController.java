package com.gotcoder.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping //경로지정.첫페이지는 아무것도 입력안함
    public String index(){
        return "index";
    }
}
