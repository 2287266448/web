package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BloggerDao;
import com.example.entity.Blogger;

@Service
public class BloggerService {
    @Autowired
    BloggerDao bloggerDao;

    public Blogger findByUsername(String username) {
        return bloggerDao.selectByUsername(username);
    }
}
