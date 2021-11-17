package com.victor.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.victor.web.entity.NoticeView;
import com.victor.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model)
	{
		List<NoticeView> list = service.getList();
		 
		model.addAttribute("list",list);
		return "customer.notice.list"; //TilesViewResolver
		//return "customer/notice/list"; resourceViewResolver
	}
	
	@RequestMapping("detail")
	public String detail()//list,detail,edit,reg
	{return "customer.notice.detail";}
	
	
}
