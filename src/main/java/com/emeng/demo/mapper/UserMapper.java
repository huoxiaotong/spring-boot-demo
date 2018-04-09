package com.emeng.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.emeng.demo.entity.UserT;

@Mapper
public interface UserMapper {

	@Select("select * from user_tbl where userId = #{userId}")  
    UserT getUserById(@Param("userId")Integer userId);
	
	UserT getUserByIdXML(@Param("userId")Integer userId);
}
