package com.example.demo.controller;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Register {

    //private String userName;
    private UserService userService;
    @Autowired
    public Register(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/Register")
    public String getRegister()
    {
        return "register";
    }
    @PostMapping("/Register")
    public String saveUser(@RequestParam("userName") String userName, @RequestParam("pass") String pass){
        System.out.println("This is the user name: "+userName+" and this is the password: "+pass);
        userService.insertUser(userName,pass);
        return "register";
    }

}

