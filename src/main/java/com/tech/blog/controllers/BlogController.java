package com.tech.blog.controllers;

import com.tech.blog.entities.Blog;
import com.tech.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class BlogController {


    @Autowired
    BlogService blogService;

    @PostMapping("/blog")
    public Blog addBlog(@RequestBody Blog blog){
        return this.blogService.addBlog(blog);
    }
}
