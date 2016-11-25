package com.rabbit.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.uncode.schedule.ConsoleManager;
import cn.uncode.schedule.core.TaskDefine;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/name")
	@ResponseBody
	public String hello(String name){
		TaskDefine task = new TaskDefine();
		task.setTargetBean("simpleUncodeTask");
		task.setTargetMethod("uncodePrint3");
		ConsoleManager.runTask(task);
		return "hello " + name;
	}
}
