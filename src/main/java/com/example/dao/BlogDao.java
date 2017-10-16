package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Blog;

@Mapper
public interface BlogDao {
	
	@Select(value="select date_format(releasedate,'%Y年%m月') as releaseDateStr,count(*) as blogReleaseCount from t_blog group by date_format(releasedate,'%Y年%m月') order by releasedate desc")
	List<Blog> getBlogArchive();
	
	@Select(value="select t1.*,t2.typename,date_format(t1.releasedate,'%Y-%m-%d %h:%i') as releaseDateBlog from t_blog t1,t_blogType t2 where t1.type_id = t2.id order by t1.id desc")
	List<Blog> getBlogArticle();
	
	@Select(value="select t1.*,t2.typename,date_format(t1.releasedate,'%Y-%m-%d %h:%i') as releaseDateBlog from t_blog t1,t_blogType t2 where t1.type_id = t2.id and (t1.title like concat('%',#{searchParam},'%') or t1.summary like concat('%',#{searchParam},'%')) order by t1.releasedate desc")
	List<Blog> searchBlog(String searchParam);
}
