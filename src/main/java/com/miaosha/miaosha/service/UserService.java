package com.miaosha.miaosha.service;

import com.miaosha.miaosha.dataobject.UserInfoDo;
import com.miaosha.miaosha.service.model.UserModel;

/**
 * 用途描述
 *
 * @author 胡晓磊
 * @company xxx
 * @date 2019年09月08日 19:13 胡晓磊 Exp $
 */
public interface UserService {
    UserModel getUserById(Integer id);
}
