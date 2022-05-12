package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import responses.UserResponses;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    private List<UserEntity> users = new ArrayList<>();

    @PostConstruct
    private void onCreate() {
        for (int i = 0; i < 51; i++)
            this.users.add(new UserEntity(1 + i, "user" + i, "user@email" + i));
    }

    public UserResponses getUserPage(Integer pageNumber, Integer pageSize) {
        int pageOffSet = (pageNumber - 1) * pageSize; // 0 * x strona = zwraca x strone
        // query sql: limit pageOffSet, pageSize
        pageNumber = Math.max(1, pageNumber);
        pageSize = Math.min(100, pageSize);
        pageSize = Math.max(1, pageSize);

        Integer pageCount = 0;
        Integer totalCount = 0;

        return new UserResponses(pageNumber, pageCount, pageSize, totalCount, users);
    }

    public UserEntity createUser(UserEntity user) {
        users.add(user);
        return user;
    }
}
