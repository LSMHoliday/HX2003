package it.hxzy.com.cn.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//时间工具类
public class DateUtils {

	public static final String formatTime = "yyyy-MM-dd";
	public static final String[] weekDays = { "星期日", "星期一", "星期二", "星期三",
			"星期四", "星期五", "星期六" };

	// 获取年
	public static int getYear(String currentTime) throws ParseException {
		SimpleDateFormat sim = new SimpleDateFormat(formatTime);
		Date nowTime = sim.parse(currentTime);
		// 把Date转为Calendar
		Calendar instance = Calendar.getInstance();
		instance.setTime(nowTime);
		return instance.get(Calendar.YEAR);
	}

	// 月
	public static int getMonth(String currentTime) throws ParseException {
		SimpleDateFormat sim = new SimpleDateFormat(formatTime);
		Date nowTime = sim.parse(currentTime);
		// 把Date转为Calendar
		Calendar instance = Calendar.getInstance();
		instance.setTime(nowTime);
		return instance.get(Calendar.MONTH) + 1;
	}
	//星期几
	public static String getWeek(String currentTime) throws ParseException {
		SimpleDateFormat sim = new SimpleDateFormat(formatTime);
		Date nowTime = sim.parse(currentTime);
		// 把Date转为Calendar
		Calendar instance = Calendar.getInstance();
		instance.setTime(nowTime);
		int w = instance.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0) w = 0;
		return weekDays[w];
	}
}
