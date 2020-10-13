package it.hxzy.com.cn.controller;

import java.util.List;

import it.hxzy.com.cn.domain.CourseModel;
import it.hxzy.com.cn.service.ICourseService;
import it.hxzy.com.cn.utils.DBUtils;
import it.hxzy.com.cn.utils.TipOrder;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	@GetMapping("/queryAll.do")
	public String queryAllCourse(Model model,RedirectAttributes attr){
		List<CourseModel> courses = courseService.queryAll();
		model.addAttribute("courses", courses);
		//参数返回到页面
		attr.addAttribute("tip",TipOrder.ONE.getTip());  
		return "adminSchool";
	}
	@PostMapping("/addCourse.do")
	@ResponseBody
	public void addCourse(String courseName){
		if(StringUtils.isBlank(courseName)){
			DBUtils.showInfo( "用户名不能为空!", "/page/index.html");
			return ;
		}
		//去除前后空格
		courseName=courseName.toString();
		//判断名称是否存在
		if(!courseService.judgeCourse(courseName)){
			DBUtils.showInfo( "the courseName is repeat!", "/course/queryAll.do");
			return ;
		}
		//save course
		boolean flag=courseService.handleAdd(courseName);
		if(flag){
			DBUtils.showInfo( "add course is success!", "/course/queryAll.do");
			return ;
		}
		DBUtils.showInfo( "add course is failed!", "/course/queryAll.do");
	}
	@GetMapping("/del.do")
	@ResponseBody
	public void delCourse(int cid){
		boolean rs = courseService.delCourse(cid);
		if(rs)
			DBUtils.showInfo( "del course is success!", "/course/queryAll.do");
		else
			DBUtils.showInfo( "del course is failed!", "/course/queryAll.do");
	}
	@PostMapping("/update.do")
	@ResponseBody
	public void updateCouse(CourseModel md){
		boolean rs = courseService.updateCourse(md);
		if(rs)
			DBUtils.showInfo( "update course is success!", "/course/queryAll.do");
		else
			DBUtils.showInfo( "update course is failed!", "/course/queryAll.do");
	}
}
