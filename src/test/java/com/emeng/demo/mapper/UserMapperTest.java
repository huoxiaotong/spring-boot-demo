package com.emeng.demo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

/**
 * @description mapper测试类
 * @ClassName: UserMapperTest
 * @version V1.0
 * @author 霍晓通
 * @Date 2018年4月9日 下午1:21:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	@Autowired()
	private UserMapper userMapper;
	
	@Test
	public void test() throws JsonProcessingException{
		System.out.println(userMapper.getUserById(1));
	}
}
