package com.table.rova.stock.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalControler {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }



}
