package com.lwy.dao;

import java.io.Serializable;

import com.lwy.model.User;

public interface UserDaoI {

    /**
     * �����û�
     * @param user
     * @return
     */
    Serializable save(User user); 
}
