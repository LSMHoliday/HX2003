package it.hxzy.com.cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import it.hxzy.com.cn.domain.CourseModel;

public interface CourseModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseModel record);

    CourseModel selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(CourseModel record);

    int updateByPrimaryKey(CourseModel record);
    
    List<CourseModel> findAll();

	boolean isRePeat(String courseName);
	@Update("update t_course set enable=0 where id=#{cid}")
	boolean updateCourseEnable(int cid);
}