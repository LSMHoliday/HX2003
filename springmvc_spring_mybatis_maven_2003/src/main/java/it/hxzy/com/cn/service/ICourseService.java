package it.hxzy.com.cn.service;

import it.hxzy.com.cn.domain.CourseModel;

import java.util.List;

public interface ICourseService {
 public List<CourseModel> queryAll();

 public boolean handleAdd(String courseName);
 
 public boolean judgeCourse(String courseName);

 public boolean delCourse(int cid);

 public boolean updateCourse(CourseModel md);

}
