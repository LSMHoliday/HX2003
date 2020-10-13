package it.hxzy.com.cn.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.hxzy.com.cn.dao.RoomModelMapper;
import it.hxzy.com.cn.domain.RoomModel;
import it.hxzy.com.cn.service.IRoomService;
@Service
public class RoomServiceImpl implements IRoomService {
	@Autowired
	private RoomModelMapper roomMapper;
	@Override
	public List<RoomModel> queryAll() {
		return roomMapper.queryAll();
	}

}
