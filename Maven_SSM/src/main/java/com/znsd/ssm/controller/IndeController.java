package com.znsd.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.znsd.ssm.entities.UserInfo;
import com.znsd.ssm.service.UserService;

@Controller
public class IndeController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("index")
	public String index() {
		List<UserInfo> find = userService.query();
		for (UserInfo user : find) {
			System.out.println(user+"----------------");
		}
		return "index";
	}
}
