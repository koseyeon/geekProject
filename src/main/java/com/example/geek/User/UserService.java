package com.example.geek.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getRecentUser(){
        List<User> users = userRepository.findAll();
        return users.get(users.size() - 1);
    }
}
