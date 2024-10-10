package com.lcwd.mvc.SpringMVCProject.controllers;


import com.lcwd.mvc.SpringMVCProject.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {


    @PostMapping(value = "/create", consumes = "application/json")
  //  public String createStudent(@RequestBody Map<String,Object>data){
        public ResponseEntity<Student>  createStudent(@RequestBody Student student){
        //System.out.println(data);
        ResponseEntity<Student>response=new ResponseEntity<>(student, HttpStatus.CREATED);
        //System.out.println(student);
        return response;

    }
}
