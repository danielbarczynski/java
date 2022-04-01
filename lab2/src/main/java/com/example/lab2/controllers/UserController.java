package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    List<UserEntity> users = new ArrayList<>();
////    List<UserEntity> users = new ArrayList<>(new UserEntity(1, "daniel"), new UserEntity(2, "mike"), new UserEntity(3, "will"));
//        public Object usersInit() {
//            users.add(new UserEntity(1, "daniel"));
//            users.add(new UserEntity(2, "mike"));
//            users.add(new UserEntity(3, "will"));
//            return users;
//        }


    @ResponseBody
    @RequestMapping("/users")
    public Object getUsers() {
        users.add(new UserEntity(1, "daniel"));
        users.add(new UserEntity(2, "mike"));
        users.add(new UserEntity(3, "will"));
        return users;
    }
//    @ResponseBody
//    @RequestMapping("/users/{id}/get") // users/123/get
//    public String GetUser(@PathVariable Long id) {
//        return "id: " + id;
//    }
////
//    @ResponseBody
//    @RequestMapping("/users/{id}/remove") // users/123/remove
//    public  Object removeUser(@PathVariable int id) {
//        users.remove()
//    }
//
@ResponseBody
    //@PathVariable int id, @PathVariable String name
    @RequestMapping("/users/add") // user/add?name=John&age=23
    public Object addUser(@RequestParam int id, @RequestParam String name) {
        users.add(new UserEntity(id, name));
        return users;
    }

}
