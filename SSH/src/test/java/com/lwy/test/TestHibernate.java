package com.lwy.test;

import java.util.Date;
import java.util.UUID;

import com.lwy.model.User;
import com.lwy.service.UserServiceI;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHibernate {

    private UserServiceI userService;
    
    /**
     * ���before���������еĲ��Է���֮ǰִ�У�����ִֻ��һ��
     * ������Junit��Ԫ����ʱһЩ��ʼ��������������������������
     * ������before���������ʼ��ApplicationContext��userService
     */
    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        userService = (UserServiceI) ac.getBean("userService");
    }
    
    @Test
    public void testSaveMethod(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("�°�����");
        user.setPwd("123");
        user.setCreatedatetime(new Date()); 
        user.setModifydatetime(new Date());
        userService.save(user);
    }
}
