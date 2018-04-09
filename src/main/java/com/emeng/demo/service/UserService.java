package com.emeng.demo.service;

import com.emeng.demo.entity.UserT;

public interface UserService {
	/**
	 * @description 通过注解获取信息
	 * @param userId
	 * @return UserT    返回类型 
	 * @author 霍晓通
	 * @date 2018年4月9日 下午2:04:00
	 */
	UserT getUserById(Integer userId);
	
	/**
	 * @description 通过xml获取信息
	 * @param userId
	 * @return UserT    返回类型 
	 * @author 霍晓通
	 * @date 2018年4月9日 下午2:04:20
	 */
	UserT getUserByIdXML(Integer userId);
}
