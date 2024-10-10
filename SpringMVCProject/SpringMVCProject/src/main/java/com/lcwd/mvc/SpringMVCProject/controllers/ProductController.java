package com.lcwd.mvc.SpringMVCProject.controllers;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;
//import java.util.logging.Logger;

@RestController
public class ProductController {
    Logger logger=LoggerFactory.getLogger(ProductController.class);



    //QueryParameter :- URL mein data bhejne ke liye
    @GetMapping("/getProducts")
    public String getProducts(
            @RequestParam("productname") String name,
            @RequestParam(value="productrating",defaultValue = "0",required = false)int rating,
            @RequestParam()int productid){

        System.out.println("Productname:-" +name);
        System.out.println(("Product rating :- " +rating));
        System.out.println("Productid:- " + productid);

        return "This is testing URL";
    }

    @RequestMapping("/checkproduct/{productname}/{productid}/{productrating}")
    public String checkProduct(
            @PathVariable("productname") String name,
            @PathVariable int productrating,
            @PathVariable int productid
    ){
//        System.out.println(name);
//        System.out.println(productrating);
//        System.out.println(productid);
        logger.error("productid {}",productid);
        logger.warn("productname {} {}",name,"Good name");
        logger.debug("productrating {}",productrating);

        return  "Checking PathVariable URI method";
    }

}
