package com.tech.blog.services.impl;

import com.tech.blog.dao.CategoryDao;
import com.tech.blog.entities.Category;
import com.tech.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;
    @Override
    public Category addCategory(Category category) {
        category.setId(UUID.randomUUID().toString());
        this.categoryDao.save(category);
        return category;
    }
}
