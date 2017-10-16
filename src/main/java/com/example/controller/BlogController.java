package com.example.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Blog;
import com.example.service.BlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 博客文章控制器
 * 
 * @author jun
 *
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	@Qualifier("blogService")
	private BlogService blogService;

	/**
	 * 查询博客 也需要分页显示
	 * 
	 * @return
	 */
	@RequestMapping("/search")
	public String searchBlog(@RequestParam(required = true, defaultValue = "1") Integer pageNum,
			@RequestParam(required = true, defaultValue = "5") Integer pageSize,
			@RequestParam(value = "searchParam") String searchParam, Model model) {

		PageHelper.startPage(pageNum, pageSize);// 默认从第一页开始，每页五条
		List<Blog> searchBlogList = blogService.searchBlog(searchParam);// 获取文章主体信息
		PageInfo<Blog> pageBlog = new PageInfo<Blog>(searchBlogList);// 将查出来的blogArticleList绑定到pageInfo中
		System.out.println("分页信息:" + searchBlogList);
		model.addAttribute("searchBlogList", searchBlogList);// 封装到Model中
		model.addAttribute("pageBlog", pageBlog);// 分页信息装入model中
		model.addAttribute("searchParam", searchParam);
		return "searchList";// 返回到查询结果展示列表页面
	}

}
