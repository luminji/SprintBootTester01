package com.zuikc.service;

import com.zuikc.bean.User;
import com.zuikc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public List<User> getUserList(){
        // 记录IP地址
        return dao.queryUserList();
    }
}
