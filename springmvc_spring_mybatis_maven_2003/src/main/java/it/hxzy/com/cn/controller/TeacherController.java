package it.hxzy.com.cn.controller;

import it.hxzy.com.cn.model.TeacherModel;
import it.hxzy.com.cn.service.ITeacherService;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.DBUtils;

@Controller
@RequestMapping("teacher")
public class TeacherController {
	@Autowired
	private ITeacherService teacherService;
	@PostMapping("/login.do")
	@ResponseBody
	public void login(String username,String password,HttpSession session){
		if(StringUtils.isBlank(username)){
			DBUtils.showInfo( "用户名不能为空!", "/page/index.html");
			return ;
		}
		if(StringUtils.isBlank(password)){
			DBUtils.showInfo("用户名不能为空!", "/page/index.html");
			return ;
		}
		
		TeacherModel teacher = teacherService.login(username, password);
		if(teacher!=null){
			session.setAttribute("teacher",teacher);
			DBUtils.showInfo("恭喜你登录成功!", "/page/teacher.html");
			return;
		}
		DBUtils.showInfo("用户名或者密码不存在!", "/page/index.html");
	}
	
}
