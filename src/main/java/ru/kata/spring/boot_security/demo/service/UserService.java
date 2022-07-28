package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<User> listUsers();

    User findByEmail(String email);

    void saveUser(User user);

    void deleteUser(long id);
}
