package com.victor.web.service;

import java.util.List;

import com.victor.web.entity.Notice;
import com.victor.web.entity.NoticeView;

public interface NoticeService {

	List<NoticeView> getList();

	Notice get(int i);

}
