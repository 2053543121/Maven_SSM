package com.znsd.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.znsd.ssm.dao.UserDao;
import com.znsd.ssm.entities.UserInfo;
import com.znsd.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<UserInfo> query() {
		return userDao.selectList();
	}

}
