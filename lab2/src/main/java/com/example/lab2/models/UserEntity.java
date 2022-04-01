package com.example.lab2.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserEntity {
    public int id;
    public String name;

    public UserEntity() {
    }

    public UserEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Object getUsers() {
        List<UserEntity> users = new ArrayList<>();
        users.add(new UserEntity(1, "daniel"));
        users.add(new UserEntity(2, "mike"));
        users.add(new UserEntity(3, "will"));
        return users;
    }
}