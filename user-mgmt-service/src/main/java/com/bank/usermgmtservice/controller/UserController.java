package com.bank.usermgmtservice.controller;

import com.bank.usermgmtservice.dto.UserAccountResponse;
import com.bank.usermgmtservice.model.User;
import com.bank.usermgmtservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public UserAccountResponse createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
