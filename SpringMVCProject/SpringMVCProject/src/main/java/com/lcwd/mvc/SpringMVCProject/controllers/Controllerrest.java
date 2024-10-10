package com.lcwd.mvc.SpringMVCProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controllerrest {

  @ResponseBody
    @RequestMapping(value = "/path",method = RequestMethod.POST)
    public List<String> getdata(){
        return Arrays.asList("Ram","Shyam");
    }
}
