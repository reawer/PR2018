package com.lwy.action;

import com.lwy.model.User;
import com.lwy.service.UserServiceI;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage("basePackage")
@Action(value="strust2Test")//ʹ��convention-plugin����ṩ��@Actionע�⽫һ����ͨjava���עΪһ�����Դ����û������Action��Action������Ϊstruts2Test
@Namespace("/")//ʹ��convention-plugin����ṩ��@Namespaceע��Ϊ���Actionָ��һ�������ռ�
public class TestAction {
    
    /**
     * ע��userService
     */
    @Autowired
    private UserServiceI userService;

    /**
     * http://localhost:8080/SSH/strust2Test!test.action
     * MethodName: test
     * Description: 
     * @author reawer
     */
    public void test(){
        System.out.println("����TestAction");
        userService.test();
    }
    
    /**
     * http://localhost:8080/SSHE/strust2Test!saveUser.action
     */
    public void saveUser(){
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setName("xdp�°�����");
        user.setPwd("123456");
        user.setCreatedatetime(new Date()); 
        user.setModifydatetime(new Date());
        userService.save(user);
    }
}