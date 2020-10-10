package com.developer.justablog.controller;

import com.developer.justablog.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Autowired
    private PrintService printService;

    @ResponseBody
    @RequestMapping("/helloworld")
    public String printHello(){
        return printService.printHello();
    }

    @ResponseBody
    @RequestMapping("/world2")
    public String printHello2(){
        return "helloworld";
    }
}
