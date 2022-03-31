package com.example.lab2.controllers;

import com.example.lab2.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/users")
    @GetMapping
    public Map<Integer, UserEntity> users() {
        HashMap<Integer, UserEntity> map = new HashMap<>();
        UserEntity user1 = new UserEntity("daniel");
        UserEntity user2 = new UserEntity("mike");
       UserEntity user3 = new UserEntity("will");
        map.put(1, user1);
        map.put(2, user2);
        map.put(3, user3);
        return map;
    }

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
