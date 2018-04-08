package com.emeng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@Value(value = "${woniu.secret}")
	private String uuid;
	@Value(value = "${woniu.number}")
	private int randomID;

	@Value(value = "${woniu.limitnumber}")
	private int limitnumber;

	@RequestMapping("/hello")
	public String homed() {
		log.info("我是log");
		log.info("我是uuid = " + uuid+",randomID="+randomID+",limitnumber="+limitnumber);
		
		return "String Boot helloword";
	}

	@GetMapping("/gethello")
	public String gethello() {
		return "String Boot helloword  gethello";
	}
}
