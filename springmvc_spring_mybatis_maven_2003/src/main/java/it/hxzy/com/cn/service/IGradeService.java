package it.hxzy.com.cn.service;

import it.hxzy.com.cn.domain.GradeModel;

import java.util.List;

public interface IGradeService {

	List<GradeModel> queryAll();
	List<GradeModel> findNeedCourse();
}
