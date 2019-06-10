package com.zuikc.dao;

import com.zuikc.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //返回用户列表
    public List<User> queryUserList(){
        // sql
        List<User> result = new ArrayList<User>();

        for (int i = 0; i <  10; i++){
            User user = new User("username" + i, "password" + i, i);
            result.add(user);
        }

        return result;
    }
}
