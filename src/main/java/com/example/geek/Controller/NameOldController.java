package com.example.geek.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/")
public class NameOldController {

    @RequestMapping("/{name}/{old}")
    @ResponseBody
    public Map<String, String> getInfo(@PathVariable String name, @PathVariable String old){
        Map<String, String> info = new HashMap<>();

        info.put("name", name);
        info.put("age",old);
        info.put("message",String.format("hello, %s years old %s!",old,name));
        return info;
    }
}
