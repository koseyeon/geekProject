package com.example.geek.User;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public User getRecentUser(){
        return userService.getRecentUser();
    }
}
