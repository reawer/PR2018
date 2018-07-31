package com.lwy.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lwy.dao.UserDaoI;
import com.lwy.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDaoI {
    
    /**
     * ʹ��@Autowiredע�⽫sessionFactoryע�뵽UserDaoImpl��
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    //@Override
    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
}
