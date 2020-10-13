package it.hxzy.com.cn.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.hxzy.com.cn.model.ClassModel;
import it.hxzy.com.cn.service.IClassService;
import net.sf.json.JSON;
import net.sf.json.JSONSerializer;

@Controller
@RequestMapping("class")
public class ClassController {
	@Autowired
	private IClassService classService;
	@PostMapping("/show.do")
	@ResponseBody
	public void showAll(HttpServletResponse resp){
		ClassModel classmodel = classService.showClass();
		JSON json = JSONSerializer.toJSON(classmodel);
		//告知浏览器使用html进行解析
		resp.setContentType("text/html;charset=utf-8");
		try {
			resp.getWriter().write(json.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
