package com.lwy.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwy.dao.UserDaoI;
import com.lwy.model.User;
import com.lwy.service.UserServiceI;

//使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
@Service("userService")
public class UserServiceImpl implements UserServiceI {
	 /**
     * 注入userDao
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
