package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.dao.MsgDAO;
import com.example.service.MsgService;

@Service(value="msgServiceImpl")
public class MsgServiceImpl implements MsgService{
	@Autowired
	@Qualifier("msgDAOImpl")
	private MsgDAO msgDao;

	public String getMsg() {
		return msgDao.getTheFirstMsg();
	}
}
