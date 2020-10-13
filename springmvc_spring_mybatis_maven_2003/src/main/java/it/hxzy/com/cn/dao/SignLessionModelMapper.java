package it.hxzy.com.cn.dao;

import it.hxzy.com.cn.domain.SignLessionModel;

public interface SignLessionModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SignLessionModel record);
    
    SignLessionModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(SignLessionModel record);
}