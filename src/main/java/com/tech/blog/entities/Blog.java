package com.tech.blog.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "blogs")
public class Blog {
    @Id
    private String id;

    private String title;

    private String content;

    private String imageUrl;

    @ManyToMany
    @JoinTable(
            name = "blog_categories",
            joinColumns = @JoinColumn(name = "blog_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categoryList;

    @OneToMany(targetEntity = Comment.class)
    private List<Comment> commentList;

}
