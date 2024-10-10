package com.lcwd.mvc.SpringMVCProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@RequestMapping("/Project")

//@Component
@Controller
//@RequestMapping
public class Superman {

@RequestMapping("/about")
    public String aboutRequesHandler(){
        System.out.println("Processing about request");
        return "About";
    }
}
