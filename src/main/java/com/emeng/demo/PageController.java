package com.emeng.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/helloPage")
	public String getPage(ModelMap map) {
		Date date = new Date();
		//传到template模板中（会把模板中能找到的所有的ftl文件中的名称都替换掉）
		map.addAttribute("vv", date.toString());
		//返回页面hello.ftl
		return "hello";
	}
}
