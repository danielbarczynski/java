package com.example.lab2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @RequestMapping("/example")
    public String example()
    {
        return "example";
    }
}