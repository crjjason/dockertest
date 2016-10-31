package com.example.controller;

import com.example.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by r.j.chen on 2016/10/28.
 */
@RestController
@RequestMapping("/")
public class UserController {
    public UserController(){
        User user1 = new User();
        user1.setFirstName("Apple");
        user1.setLastName("First");
        users.add(user1);

        User user2 = new User();
        user2.setFirstName("Orange");
        user2.setLastName("Second");
        users.add(user2);
    }

    private List<User> users = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<User> userList(){
        return users;
    }
}
