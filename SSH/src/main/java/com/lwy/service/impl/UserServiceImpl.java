package com.lwy.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwy.dao.UserDaoI;
import com.lwy.model.User;
import com.lwy.service.UserServiceI;

//ʹ��Spring�ṩ��@Serviceע�⽫UserServiceImpl��עΪһ��Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	 /**
     * ע��userDao
     */
    @Autowired
    private UserDaoI userDao;
    
	//@Override
	public void test() {
		System.out.println("Hello World!");
	}
	
	public void ssh() {
		System.out.println("Begin SSH Success!");
	}
	
	 //@Override
	    public Serializable save(User user) {
	        return userDao.save(user);
	    }
}
