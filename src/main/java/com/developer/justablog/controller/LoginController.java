package com.developer.justablog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    @ResponseBody
    @RequestMapping("/world2")
    public String printHello2(){
        return "helloworld";
    }
}
