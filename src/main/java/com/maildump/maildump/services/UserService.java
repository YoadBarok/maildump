package com.maildump.maildump.services;

import com.maildump.maildump.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);
}
