package com.victor.web.service;

import java.util.List;

import com.victor.web.entity.Notice;

public interface NoticeService {

	List<Notice> getList();

	Notice get(int i);

}
