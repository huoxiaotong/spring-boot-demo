package com.emeng.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emeng.demo.entity.UserT;
import com.emeng.demo.mapper.UserMapper;
import com.emeng.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserT getUserById(Integer userId) {
		return userMapper.getUserById(userId);
	}

	@Override
	public UserT getUserByIdXML(Integer userId) {
		return userMapper.getUserByIdXML(userId);
	}
}
