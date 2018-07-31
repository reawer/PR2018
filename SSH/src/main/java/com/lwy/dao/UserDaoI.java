package com.lwy.dao;

import java.io.Serializable;

import com.lwy.model.User;

public interface UserDaoI {

    /**
     * ±£¥Ê”√ªß
     * @param user
     * @return
     */
    Serializable save(User user); 
}
