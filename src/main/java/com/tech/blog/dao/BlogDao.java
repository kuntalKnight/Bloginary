package com.tech.blog.dao;

import com.tech.blog.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao extends JpaRepository<Blog,Integer> {
}
