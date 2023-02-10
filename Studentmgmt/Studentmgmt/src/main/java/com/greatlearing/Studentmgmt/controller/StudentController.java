package com.greatlearing.Studentmgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
