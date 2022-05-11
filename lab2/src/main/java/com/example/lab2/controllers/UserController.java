package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import responses.UserResponses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    // http://localhost:2000/api/users?page-number=1&page-size=20
    @RequestMapping(
            value = "/api/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public Object apiUsers(@RequestParam(value = "page-number", defaultValue = "1") Integer pageNumber,
    @RequestParam(value = "page-size", defaultValue = "20") Integer pageSize){
        return this.userService.getUserPage(pageNumber, pageSize);
    }

    @RequestMapping(
            value = "/api/user/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public UserEntity createUser(@RequestBody UserEntity user) {
        this.userService.createUser(user.getName(), user.getEmail());
        return user;
    }
}

