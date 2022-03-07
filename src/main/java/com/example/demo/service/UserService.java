package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public Optional<User> getId(Long id){
        Optional<User> userById = userRepository.findById(id);

        return userById;
    }
    public void  insertUser(String userName, String pass){
        User newUser = new User(userName,pass);
        userRepository.save(newUser);

    }
    public List<User> findAll(){
        var userIt = userRepository.findAll();
        List<User> userList = new ArrayList<>();
        userIt.forEach(e->userList.add(e));
        return  userList;
    }
    
}
