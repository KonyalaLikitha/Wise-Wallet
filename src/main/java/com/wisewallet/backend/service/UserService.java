package com.wisewallet.backend.service;

import java.util.List;
import com.wisewallet.backend.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User updateUser(Long id, User user);

    void deleteUser(Long id);
}