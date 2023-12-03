package com.tech.blog.controllers;

import com.tech.blog.entities.Category;
import com.tech.blog.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/category")
    public Category addCategory(@RequestBody Category category){
        return this.categoryService.addCategory(category);
    }
}
