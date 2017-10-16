package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.entity.BlogType;

/**
 * 博客类型操作的Dao
 * @author jun
 *
 */
@Mapper
public interface BlogTypeDao {
	  //获取博客类别信息
	@Select(value="SELECT t2.*,COUNT(t1.id) AS blogTypeCoun FROM t_blog t1 JOIN t_blogType t2 ON t1.type_id = t2.id GROUP BY t2.typename ORDER BY t2.ordernum")
    List<BlogType> getBlogTypeData();
	
	@Select(value="select * from t_blog where id=#{id}")
	BlogType getBlogTypeById();
}
