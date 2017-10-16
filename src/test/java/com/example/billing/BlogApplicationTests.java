package com.example.billing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.BloggerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    BloggerService bloggerService;

    @Test
    public void testSelectByUsername() {
        System.out.println(bloggerService.findByUsername("zhaoy").toString());
    }

}
