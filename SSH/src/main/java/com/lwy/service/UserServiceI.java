package com.lwy.service;

import java.io.Serializable;

import com.lwy.model.User;

public interface UserServiceI {
	 /**
     * 测试方法
     */
    void test();
    void ssh();
    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}
