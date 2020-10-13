package it.hxzy.com.cn.service.impl;

import it.hxzy.com.cn.dao.GradeModelMapper;
import it.hxzy.com.cn.domain.GradeModel;
import it.hxzy.com.cn.service.IGradeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GradeServiceImpl implements IGradeService {
	@Autowired
	private GradeModelMapper graderMapper;
	@Override
	public List<GradeModel> queryAll() {
		// TODO Auto-generated method stub
		 return graderMapper.findAll();
	}
	@Override
	public List<GradeModel> findNeedCourse() {
		// TODO Auto-generated method stub
		return graderMapper.findNeedCourse();
	}

}
