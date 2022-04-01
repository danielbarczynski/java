package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import com.example.lab2.models.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
//    private HashMap<UserEntity> map = new HashMap<>();
//    UserEntity user1 = new UserEntity(1, "daniel");
//    UserEntity user2 = new UserEntity(2, "mike");
//    UserEntity user3 = new UserEntity(3, "will");
//    @GetMapping

//    public Map<UserEntity> users() {
//        map.put(user1);
//        map.put(user2);
//        map.put(user3);
//        return map;
//    }


    @ResponseBody
    @RequestMapping("/users")
    public Object users()
    {
        return UserEntity.getUsers();
    }

//    @ResponseBody
//    @RequestMapping("/users/{id}/get") // users/123/get
//    public String GetUser(@PathVariable Long id) {
//        return "id: " + id;
//    }
//
//    @ResponseBody
//    @RequestMapping("/users/{id}/remove") // users/123/remove
//    public Map<UserEntity> RemoveUser(@PathVariable Long id) {
//        map.remove(id);
//        return map;
//    }
//
//    @RequestMapping("/users/add") // user/add?name=John&age=23
//    public Map<UserEntity>  AddUser(@PathVariable String name, @PathVariable Long id) {
//        map.put(name, id);
//        return map;
//    }

}
