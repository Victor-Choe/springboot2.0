package com.victor.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@RequestMapping("list")
	public String list(Model model)
	{
		model.addAttribute("test","hello12312");
		return "customer.notice.list"; //TilesViewResolver
		//return "customer/notice/list"; resourceViewResolver
	}
	
	@RequestMapping("detail")
	public String detail()//list,detail,edit,reg
	{return "customer.notice.detail";}
	
	
}
