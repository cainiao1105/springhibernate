package com.czb.dao;

import java.sql.SQLException;

import com.czb.dao.model.UserInfo;

public interface IUserDao {
	public void saveUser(UserInfo user) throws SQLException;  
	  
    public void delUser(UserInfo user) throws SQLException;  
  
    public void editUsre(UserInfo user) throws SQLException;  
  
    public UserInfo getUserById(int id) throws SQLException;  

}
