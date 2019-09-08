package com.miaosha.miaosha.dao;

import com.miaosha.miaosha.dataobject.UserPasswordDo;
import com.miaosha.miaosha.dataobject.UserPasswordDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPasswordDoMapperExtend {
    /**
     * 根据用户ID查找密码
     * @param id
     * @return
     */
    UserPasswordDo selectByUserId(Integer id);
}
