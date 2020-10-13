package it.hxzy.com.cn.controller;

import it.hxzy.com.cn.domain.GradeModel;
import it.hxzy.com.cn.service.IGradeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("grade")
public class GradeController {
	@Autowired
	private IGradeService gradeService;
	@GetMapping("/queryAll.do")
	public String queryAllCourse(Model model){
		List<GradeModel> grades = gradeService.queryAll();
		model.addAttribute("grades", grades);
		return "adminClass";
	}
}
