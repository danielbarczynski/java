package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    List<UserEntity> users = new ArrayList<>();

    @ResponseBody
    @RequestMapping("/users")
    public Object getUsers() {
        users.add(new UserEntity(1, "daniel"));
        users.add(new UserEntity(2, "mike"));
        users.add(new UserEntity(3, "will"));
        return users;
    }

    @ResponseBody
    @RequestMapping("/users/{id}/get")
    public Object getUser(@PathVariable int id) {
        return users.get(id);
    }

    @ResponseBody
    @RequestMapping("/users/{id}/remove")
    public Object removeUser(@PathVariable int id) {
        users.remove(id);
        return users;
    }

    @ResponseBody
    @RequestMapping("/users/add") // user/add?name=John&age=23
    public Object addUser(@RequestParam int id, @RequestParam String name) {
        users.add(new UserEntity(id, name));
        return users;
    }
}
