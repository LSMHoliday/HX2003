package it.hxzy.com.cn.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import it.hxzy.com.cn.dao.SignLessionModelMapper;
import it.hxzy.com.cn.domain.SignLessionModel;
import it.hxzy.com.cn.domain.TeacherModel;
import it.hxzy.com.cn.service.ISignLessionService;
import it.hxzy.com.cn.utils.Contants;
import it.hxzy.com.cn.utils.DateUtils;
@Service
public class SignLessionServiceImpl implements ISignLessionService {
	@Autowired
	private SignLessionModelMapper lessionMapper;

	@Transactional
	@Override
	public boolean handleSign(String[] selectDate, SignLessionModel lessions) throws ParseException {
		boolean flag=true;
		HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.currentRequestAttributes())).getRequest();
		TeacherModel tModel = (TeacherModel) WebUtils.getSessionAttribute(request, Contants.sessionKey);
		for (String sk : selectDate) {
			lessions.setAttendtime(sk);
			//开始设置month-year-week
			lessions.setMonth(DateUtils.getMonth(sk));
			lessions.setYear(DateUtils.getYear(sk));
			lessions.setWeek(DateUtils.getWeek(sk));
			
			lessions.setSigntime(new Date());
		
			lessions.setTeahcerid(tModel.getId());
			
			int number=lessionMapper.insert(lessions);
			if(number==0){
				flag=false;
				break;
			}
		}
		
		return flag;
	}
	
}
