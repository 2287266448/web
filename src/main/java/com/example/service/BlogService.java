package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BlogDao;
import com.example.entity.Blog;


@Service
public class BlogService  {

	@Autowired
	private BlogDao blogDao;


	public List<Blog> getBlogArchive() {
		return blogDao.getBlogArchive();
	}


	public List<Blog> getBlogArticle() {
		return blogDao.getBlogArticle();
	}

	public List<Blog> searchBlog(String searchParam) {
		return blogDao.searchBlog(searchParam);
	}

}
