package com.victor.web.dao;

import java.util.List;

import com.victor.web.entity.Notice;

public interface NoticeDao {

	List<Notice> getList();
	Notice get(int id);
}
