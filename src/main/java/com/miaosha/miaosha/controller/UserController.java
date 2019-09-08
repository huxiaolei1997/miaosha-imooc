package com.miaosha.miaosha.controller;

import com.miaosha.miaosha.service.UserService;
import com.miaosha.miaosha.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年09月08日 19:12 胡晓磊 Exp $
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public UserModel getUser(@RequestParam(name="id") Integer id) {
        UserModel userModel = userService.getUserById(id);
        return userModel;
    }
}
