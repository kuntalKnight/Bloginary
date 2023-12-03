package com.tech.blog.services.impl;

import com.tech.blog.dao.BlogDao;
import com.tech.blog.entities.Blog;
import com.tech.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;
    @Override
    public Blog addBlog(Blog blog) {
        blog.setId(UUID.randomUUID().toString());
        System.out.println(blog.getCategoryList());
        System.out.println(blog.getCommentList());
        this.blogDao.save(blog);
        return blog;
    }
}
