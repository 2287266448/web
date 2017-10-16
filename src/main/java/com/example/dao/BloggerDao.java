package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.entity.Blogger;

@Mapper
public interface BloggerDao {

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
	@Select (value="select * from t_blogger where username=#{username}")
    Blogger selectByUsername(String username);

}
