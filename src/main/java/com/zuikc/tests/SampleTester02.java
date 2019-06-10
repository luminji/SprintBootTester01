package com.zuikc.tests;

import com.zuikc.bean.User;
import com.zuikc.com.zuikc.config.SpringConfig;
import com.zuikc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SampleTester02 {
    public static void main(String[] args) {
        // 实例化Spring容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        // 获取bean对象（dao和Service，大的业务bean）
        UserService service = context.getBean(UserService.class);

        List<User> list = service.getUserList();
        for (User user :
                list) {
            System.out.println(user.toString());
        }

        System.out.println(((List) list).size());

        context.destroy();
    }
}
