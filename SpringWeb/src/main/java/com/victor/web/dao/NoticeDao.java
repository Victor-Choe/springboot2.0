package com.victor.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.victor.web.entity.Notice;
import com.victor.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	@Select("SELECT * FROM springtest.noticeview;")
	List<NoticeView> getList();
	Notice get(int id);
}
