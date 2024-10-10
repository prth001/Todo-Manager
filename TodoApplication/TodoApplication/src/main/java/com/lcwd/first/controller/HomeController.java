package com.lcwd.first.controller;

import com.lcwd.first.config.LCWDconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {
    @Value("{${ lcwd.profile.image.path}")
    private String profilePath;
    @RequestMapping("/todos")
     public List<String> justTest(){
         List<String> todos= Arrays.asList("Learn java","Learn Springboot","Make Basic project","Learn Python");
return todos;
     }

   @Autowired
    private LCWDconfig lcwdcofig;

    @RequestMapping("c")
    public LCWDconfig getLcwdcofig(){
        return this.lcwdcofig=lcwdcofig;
    }

    @RequestMapping("/profile-path")
         public String getProfilePath(){
        return this.profilePath=profilePath;
         }
}
