package com.example.lab2.controllers;

import com.example.lab2.models.UserEntity;
import org.springframework.stereotype.Service;
import responses.UserResponses;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

@Service
public class UserService {
    private List<UserEntity> users = new ArrayList<>();

    @PostConstruct
    private void onCreate() throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new FileReader("C:\\Users\\itsmy\\IdeaProjects\\lab2\\lab2\\src\\main\\resources\\static\\allUsers"))) {
            while (scanner.hasNext()) {
                users.add(new UserEntity(scanner.nextInt(), scanner.next(), scanner.next()));
                }
            }
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

    public UserEntity getUser(int id) {
        return users.get(id);
    }

    public UserEntity updateUser(int id, UserEntity user) {
        user.setId(id);
        return users.set(id, user);
    }

    public Map<String, Boolean> removeUser(int id) {
        users.remove(id);
        return Collections.singletonMap("result", true);
    }

    @PreDestroy
    private void onDestroy() throws IOException {
        try (FileWriter writer = new FileWriter("C:\\Users\\itsmy\\IdeaProjects\\lab2\\lab2\\src\\main\\resources\\static\\allUsers")) {
            for (UserEntity user : users) {
                    writer.write(user.getId() + " " + user.getEmail() + " " + user.getName());
                }
            }
    }
}
