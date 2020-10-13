package it.hxzy.com.cn.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.hxzy.com.cn.dao.CourseModelMapper;
import it.hxzy.com.cn.domain.CourseModel;
import it.hxzy.com.cn.service.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseModelMapper courseMapper;

	@Override
	public List<CourseModel> queryAll() {
		return courseMapper.findAll();
	}

	@Transactional
	public boolean handleAdd(String courseName) {
		
		CourseModel course=new CourseModel();
		course.setCourseName(courseName);
		course.setCreateTime(new Date());
		course.setEnable(1);
		int count = courseMapper.insert(course);
		return count>0?true:false;
	}

	@Override
	public boolean judgeCourse(String courseName) {
		boolean rs = courseMapper.isRePeat(courseName);
		return !rs;
	}

	@Override
	public boolean delCourse(int cid) {
		return courseMapper.updateCourseEnable(cid);
	}

	@Override
	public boolean updateCourse(CourseModel md) {
		 return courseMapper.updateByPrimaryKeySelective(md);
	}

}
