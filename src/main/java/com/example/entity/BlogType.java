package com.example.entity;
import java.util.List;

/**
 * 博客类型
 * 
 * @author jun
 *
 */
public class BlogType {

	private Integer id;//博客类型id
	private String typeName;//类型名
	private String orderNum;//排序

	//数据库中没有的字段
	private Integer blogTypeCount;// 每个类型所拥有的博客数量
	
	private List<Blog> blogs;//一个博客类型可对应多篇博客
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getBlogTypeCount() {
		return blogTypeCount;
	}

	public void setBlogTypeCount(Integer blogTypeCount) {
		this.blogTypeCount = blogTypeCount;
	}
	
	

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	@Override
	public String toString() {
		return "BlogType [id=" + id + ", typeName=" + typeName + ", orderNum=" + orderNum + ", blogTypeCount="
				+ blogTypeCount + "]";
	}

}
