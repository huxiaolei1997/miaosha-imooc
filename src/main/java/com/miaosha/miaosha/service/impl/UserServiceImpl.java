package com.miaosha.miaosha.service.impl;

import com.miaosha.miaosha.dao.UserInfoDoMapper;
import com.miaosha.miaosha.dao.UserPasswordDoMapper;
import com.miaosha.miaosha.dao.UserPasswordDoMapperExtend;
import com.miaosha.miaosha.dataobject.UserInfoDo;
import com.miaosha.miaosha.dataobject.UserPasswordDo;
import com.miaosha.miaosha.service.UserService;
import com.miaosha.miaosha.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年09月08日 19:13 胡晓磊 Exp $
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoDoMapper userInfoDoMapper;

    @Autowired
    private UserPasswordDoMapper userPasswordDoMapper;

    @Autowired
    private UserPasswordDoMapperExtend userPasswordDoMapperExtend;

    @Override
    public UserModel getUserById(Integer id) {
        UserInfoDo userInfoDo = userInfoDoMapper.selectByPrimaryKey(id);


        if (null == userInfoDo) {
            return null;
        }

        UserPasswordDo userPasswordDo = userPasswordDoMapperExtend.selectByUserId(id);
        return convertFromDataObject(userInfoDo, userPasswordDo);
    }

    private UserModel convertFromDataObject(UserInfoDo userInfoDo, UserPasswordDo userPasswordDo) {
        if (null == userInfoDo) {
            return null;
        }


        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userInfoDo, userModel);

        if (null != userPasswordDo) {
            userModel.setEncrptPassword(userPasswordDo.getEncrptPassword());
        }

        return userModel;
    }
}
