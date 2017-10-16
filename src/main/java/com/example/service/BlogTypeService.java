package com.example.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BlogTypeDao;
import com.example.entity.BlogType;

@Service
public class BlogTypeService {

	@Autowired
	private BlogTypeDao blogTypeDao;

	public List<BlogType> getBlogTypeData() {
		return blogTypeDao.getBlogTypeData();
	}

}
