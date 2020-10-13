package it.hxzy.com.cn.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
public class DBUtils {

	public static String showInfo( String info_str, String url) {
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		PrintWriter pout = null;
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			pout = response.getWriter();
			pout.print("<script charset=\"UTF-8\" >alert('" + info_str + "');location.href='" + url + "';</script>");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pout != null) {
				pout.close();
			}
		}
		return null;
	}

	
}
