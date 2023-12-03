package com.tech.blog.services;

import com.tech.blog.entities.User;

import java.util.List;

public interface UserService {
     List<User> getAllUsers();

     User addUser(User user);

     User updateUser(String originalEmail,String updatedEmail);

     User deleteUser(User user);


}
