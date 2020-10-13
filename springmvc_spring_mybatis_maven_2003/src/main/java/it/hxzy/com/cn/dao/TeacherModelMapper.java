package it.hxzy.com.cn.dao;

import org.apache.ibatis.annotations.Param;

import it.hxzy.com.cn.model.TeacherModel;

public interface TeacherModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherModel record);

    TeacherModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherModel record);

    int updateByPrimaryKey(TeacherModel record);
    
    TeacherModel findTeacherByNameAndPwd(@Param("username")String username,@Param("password")String pwd);
}