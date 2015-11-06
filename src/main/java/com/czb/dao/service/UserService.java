package com.czb.dao.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czb.dao.IUserDao;
import com.czb.dao.model.UserInfo;
@Service
public class UserService {
	

	@Autowired IUserDao userDao;
//	 public void setUserDao(IUserDao userDao) {
//		this.userDao = userDao;
//	}

	
	public void add(UserInfo user) throws SQLException{
		userDao.saveUser(user);
	}
	public UserInfo find(int id)throws SQLException{
	return	userDao.getUserById(id);
	}

}
