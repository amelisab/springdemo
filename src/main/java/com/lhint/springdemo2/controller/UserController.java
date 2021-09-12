package com.lhint.springdemo2.controller;

import com.lhint.springdemo2.model.User;
import com.lhint.springdemo2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.find(id);
    }

    @GetMapping("/users")
    public List<User> listAllUsers(){
        return userService.listAll();
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userService.saveOrUpdate(user);
    }

    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Integer userId){
        userService.delete(userId);
    }

    @PutMapping("users")
    public User updateUser(@RequestBody User user){
        return userService.saveOrUpdate(user);
    }
}
