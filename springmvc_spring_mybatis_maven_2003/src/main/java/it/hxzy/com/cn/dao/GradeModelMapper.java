package it.hxzy.com.cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import it.hxzy.com.cn.domain.GradeModel;

public interface GradeModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeModel record);

    int insertSelective(GradeModel record);

    GradeModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeModel record);

    int updateByPrimaryKey(GradeModel record);
    @Select("select * from t_grade order by create_time desc ")
	List<GradeModel> findAll();
    @Select("select * from t_grade where create_time>DATE_SUB(now(),INTERVAL 8 month) order by gradename desc  ")
    List<GradeModel> findNeedCourse();
    
}