package com.springapp.cinemaapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFunctions {

    @RequestMapping
    public String helloWorld(){
        return "Hello world from spring";
    }
}
