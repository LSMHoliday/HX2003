package it.hxzy.com.cn.service.impl;

import it.hxzy.com.cn.dao.TeacherModelMapper;
import it.hxzy.com.cn.model.TeacherModel;
import it.hxzy.com.cn.service.ITeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TeacherServiceImpl implements ITeacherService {
	@Autowired
	private TeacherModelMapper teacherMapper;
	@Override
	public TeacherModel login(String username, String pwd) {
		return teacherMapper.findTeacherByNameAndPwd(username, pwd);
	}

}
