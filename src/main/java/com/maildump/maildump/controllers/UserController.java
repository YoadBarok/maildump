package com.maildump.maildump.controllers;

import com.maildump.maildump.models.User;
import com.maildump.maildump.models.dto.UserDTO;
import com.maildump.maildump.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "user/")

public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return this.userService.getAllUsers().stream()
                .map(User::toDTO).collect(Collectors.toList());
    }

}
