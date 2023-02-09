package com.springapp.cinemaapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFunctions {

    @RequestMapping
    public String helloWorld(){
        return "Hello world from spring";
    }

    //Login user Users login= UserFactory.getUsers(new LoginProc(email,pass));
    //Register a user  Users register=UserFactory.getUsers(new Registration(fullname,emailReg,passReg,passConf));
}
