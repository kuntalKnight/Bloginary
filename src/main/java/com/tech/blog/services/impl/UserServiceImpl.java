package com.tech.blog.services.impl;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    private List<User> users=new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        this.users=this.userDao.findAll();
        return users;
    }

    @Override
    public User addUser(User user) {
        this.userDao.save(user);
        return user;
    }

    @Override
    public User updateUser(String originalEmail,String updatedEmail) {
        User userToBeFound = this.userDao.findByEmail(originalEmail);
        System.out.println(userToBeFound);
        userToBeFound.setEmail(updatedEmail);
        this.userDao.save(userToBeFound) ;
        return userToBeFound;
    }

    @Override
    public User deleteUser(User user) {
        this.userDao.delete(user);
        return user;
    }
}
