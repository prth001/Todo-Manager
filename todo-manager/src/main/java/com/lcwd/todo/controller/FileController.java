package com.lcwd.todo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.InputStream;

@RestController
@RequestMapping("/file")
public class FileController {
    Logger logger= LoggerFactory.getLogger(FileController.class);

    @PostMapping("/single")
    public String Uploadfile(@RequestParam("image") MultipartFile file){
        logger.info("File name {}",file.getName());
        logger.info("orginial file name {}",file.getOriginalFilename());
        logger.info("Cintent of file {}",file.getContentType());

//        InputStream inputStream=file.getInputStream();
//        FileOutputStream fileOutputStream=FileOutputStream("data.png");
        return "File Test";

    }
}
