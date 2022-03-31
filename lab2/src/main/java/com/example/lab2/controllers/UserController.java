package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class UserController {
    private Map<Integer, UserEntity> map;

    @RequestMapping("/users")
    @ResponseBody
    public String users()
    {
        return "users";
    }
    
//    public Map<Integer, UserEntity> users() {
//        return map;
//    }


    @RequestMapping("/users/{id}/get") // users/123/get
    public String GetUser() {
        return "whatever";
    }

    @RequestMapping("/users/{id}/remove") // users/123/remove
    public String RemoveUser() {
        return "whatever";
    }

    @RequestMapping("/users/add") // user/add?name=John&age=23
    public String AddUser() {
        return "whatever";
    }

}
