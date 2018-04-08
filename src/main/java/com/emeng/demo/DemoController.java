package com.emeng.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping("/hello")
	public String homed() {
		log.info("我是log");
		return "String Boot helloword";
	}
	
	@GetMapping("/gethello")
	public String gethello() {
		return "String Boot helloword  gethello";
	}
}
