package it.hxzy.com.cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import it.hxzy.com.cn.dao.TimeModelMapper;
import it.hxzy.com.cn.domain.TimeModel;
import it.hxzy.com.cn.service.ITimeService;
@Service
public class TimeServiceImpl implements ITimeService {
	@Resource
	private TimeModelMapper timeMapper;
	@Override
	public List<TimeModel> queryAll() {
		return timeMapper.queryAll();
	}

}
