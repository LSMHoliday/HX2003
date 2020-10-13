package it.hxzy.com.cn.dao;

import it.hxzy.com.cn.domain.RoomModel;

import java.util.List;

public interface RoomModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoomModel record);

    RoomModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoomModel record);

    int updateByPrimaryKey(RoomModel record);
    
    List<RoomModel> queryAll();
}