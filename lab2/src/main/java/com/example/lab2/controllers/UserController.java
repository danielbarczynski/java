package com.example.lab2.controllers;
import com.example.lab2.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

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
                           @RequestParam(value = "page-size", defaultValue = "20") Integer pageSize) {
        return userService.getUserPage(pageNumber, pageSize);
    }

    @RequestMapping(
            value = "/api/user/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @RequestMapping(
            value = "/api/users/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    @ResponseBody
    public UserEntity getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @RequestMapping(
            value = "/api/users/{id}/update",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    @ResponseBody
    public ResponseEntity<UserEntity> updateUser(@PathVariable("id") int id, @RequestBody UserEntity user) {
        if(userService.getUser(id) == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @RequestMapping(
            value = "/api/users/{id}/remove",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    @ResponseBody
    public ResponseEntity<Map<String, Boolean>> removeUser(@PathVariable("id") int id) {
        if(userService.getUser(id) == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(userService.removeUser(id));
    }
}


