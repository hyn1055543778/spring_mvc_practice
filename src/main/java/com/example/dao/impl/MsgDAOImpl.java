package com.example.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.dao.MsgDAO;
@Repository(value="msgDAOImpl")
public class MsgDAOImpl implements MsgDAO{

	@Override
	public String getTheFirstMsg() {
		return "hello world!";
	}

}
