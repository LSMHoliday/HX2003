package it.hxzy.com.cn.dao;

import it.hxzy.com.cn.domain.TimeModel;

import java.util.List;

public interface TimeModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TimeModel record);

    TimeModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TimeModel record);

    int updateByPrimaryKey(TimeModel record);
    
    List<TimeModel> queryAll();
}