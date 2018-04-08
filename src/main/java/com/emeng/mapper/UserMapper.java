package com.emeng.mapper;

import com.emeng.entity.UserT;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Select("select * from user where userId = #{userId}")  
    UserT Select(int age);
}
