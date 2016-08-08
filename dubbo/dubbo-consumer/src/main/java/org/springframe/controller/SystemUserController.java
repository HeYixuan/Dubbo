package org.springframe.controller;

import org.springframe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/systemUser")
public class SystemUserController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testDubbo")
	@ResponseBody
	public String sayDubbo(){
		return testService.testSayDubbo();
	}

	@RequestMapping("/testSay")
	@ResponseBody
	public String sayHello(String name){
		return testService.say(name);
	}
}
