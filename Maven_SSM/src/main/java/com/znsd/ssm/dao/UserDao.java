package com.znsd.ssm.dao;

import java.util.List;

import com.znsd.ssm.entities.UserInfo;

public interface UserDao {
	//查询全部
	public List<UserInfo> selectList();
}
