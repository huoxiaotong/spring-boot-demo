package com.emeng.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emeng.demo.entity.UserT;
import com.emeng.demo.service.UserService;

@RestController
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);


	@Autowired
	private UserService userService;
    
    @RequestMapping("/user/{id}")
    public String selectAge(@PathVariable(value = "id") Integer id){  
          
		UserT user = userService.getUserById(id);
		log.info("注解获取信息："+user.toString());
		
		UserT userXml = userService.getUserByIdXML(id);
		log.info("xml获取信息："+userXml.toString());
		return user.toString();
    	
    }  
}
