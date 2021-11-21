package com.example.geek.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public HashMap<String,String> getRecentUser(){
        List<User> users = userRepository.findAll();
        HashMap<String,String> user = new HashMap<String,String>();
        user.put("name",users.get(users.size() - 1).getName());
        user.put("age",users.get(users.size() - 1).getAge().toString());
        return user;
    }
}
