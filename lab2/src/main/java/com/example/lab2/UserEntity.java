package com.example.lab2;

import org.springframework.stereotype.Service;

@Service
public class UserEntity {
    public String name;

    public UserEntity() {
    }

    public UserEntity(String name) {
        this.name = name;
    }
}
