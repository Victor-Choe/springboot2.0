package com.victor.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

	@RequestMapping("/customer/notice/list")
	public String list()//list,detail,edit,reg
	{return "";}
	
	@RequestMapping("/customer/notice/detail")
	public String detail()//list,detail,edit,reg
	{return "";}
	
	
}
