package com.czb.dao.impl;

import java.sql.SQLException;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.czb.dao.IUserDao;
import com.czb.dao.model.UserInfo;


public class IUserDaoImpl extends HibernateDaoSupport implements IUserDao{
	
	
	public IUserDaoImpl() {
		super();
		
	}
	/* private HibernateTemplate hibernateTemplate;
	 public void setSessionFactory(SessionFactory sessionFactory) {  
	        this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
	    }
	 */

		public IUserDaoImpl(SessionFactory sessionFactory) {
			super.setSessionFactory(sessionFactory);
		}

	public void saveUser(UserInfo user) throws SQLException {
		this.getHibernateTemplate().save(user);
		
	}

	public void delUser(UserInfo user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void editUsre(UserInfo user) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public UserInfo getUserById(int id) throws SQLException {
		
	//return 	(UserInfo) hibernateTemplate.get(UserInfo.class, id);
	Query query = 	this.getSession().createQuery("from UserInfo where id =:id");
	   query.setInteger("id", id);
	   return    (UserInfo) query.uniqueResult();
		
	}  
	

}
