package com.lwy.service;

import java.io.Serializable;

import com.lwy.model.User;

public interface UserServiceI {
	 /**
     * ���Է���
     */
    void test();
    void ssh();
    /**
     * �����û�
     * @param user
     * @return
     */
    Serializable save(User user); 
}
