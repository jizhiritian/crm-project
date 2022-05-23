package com.bjpowernode.crm.workbench.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WorkbenchIndexController {
    @RequestMapping("/workbench/index.do")
    private String index(){
        //跳转到主页
        return "workbench/index";
    }
}
