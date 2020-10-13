package it.hxzy.com.cn.service;

import java.text.ParseException;

import it.hxzy.com.cn.domain.SignLessionModel;

public interface ISignLessionService {

	boolean handleSign(String[] selectDate, SignLessionModel lessions) throws ParseException;

}
