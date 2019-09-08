package com.miaosha.miaosha.dao;

import com.miaosha.miaosha.dataobject.UserPasswordDo;
import com.miaosha.miaosha.dataobject.UserPasswordDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPasswordDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    long countByExample(UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int deleteByExample(UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int insert(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int insertSelective(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    List<UserPasswordDo> selectByExample(UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    UserPasswordDo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") UserPasswordDo record, @Param("example") UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") UserPasswordDo record, @Param("example") UserPasswordDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserPasswordDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<UserPasswordDo> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<UserPasswordDo> list, @Param("selective") UserPasswordDo.Column ... selective);
}