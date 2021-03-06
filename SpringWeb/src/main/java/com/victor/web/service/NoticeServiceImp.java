package com.victor.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.web.dao.NoticeDao;
import com.victor.web.entity.Notice;
import com.victor.web.entity.NoticeView;

@Service
public class NoticeServiceImp implements NoticeService{
	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<NoticeView> getList() {
		
		List<NoticeView> list =noticeDao.getList();
		
		return list;
	}

	@Override
	public Notice get(int id) {
		
		Notice notice = noticeDao.get(id);
		
		return notice;
	}

	
}
