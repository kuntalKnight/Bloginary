package com.tech.blog.controllers;

import com.tech.blog.entities.User;
import com.tech.blog.models.UpdateUserModel;
import com.tech.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody UpdateUserModel updateUserModel){
        System.out.println("in here");
//        System.out.println(updateUserModel.getOriginalEmail());
//        System.out.println(updateUserModel.getUpdatedEmail());
        return this.userService.updateUser(updateUserModel.getOriginalEmail(),updateUserModel.getUpdatedEmail());
    }

    @DeleteMapping("/users")
    public User deleteUser(@RequestBody User user){
        return this.userService.deleteUser(user);
    }
}
