package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: meiyt
 * @date: 2024-07-01
 **/
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public String getUserById(long userId){
        User user = userService.getUserById(userId);
        if(null != user) {
            return user.getUserName();
        }
        return "查无此人";
    }
}
