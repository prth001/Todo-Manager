package com.lcwd.mvc.SpringMVCProject.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Apicontroller {

    @RequestMapping("/name")
    @ResponseBody
    public String getname(){
        return "My name is Parth";
    }
}
