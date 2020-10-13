<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<title>body_right</title>
<script >
	$(function(){
		$("#tile-content li").each(function(i){
			let path_url=location.pathname;
			let href_url=$(this).children().attr('href');
			if(path_url==href_url){
				$(this).children().attr('class','active');
				$(this).siblings().children().removeAttr("class");
			}
		 });
	})
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
       <div class="adminschool-title">
            	<nav>
                	<ul class="clearfix" id="tile-content">
                    	<li><a href="/course/queryAll.do" class="active">课程管理</a></li>
                        <li><a href="/grade/queryAll.do">班级管理</a></li>
                        <li><a href="adminRoom.html">教室管理</a></li>
                        <li><a href="adminTime.html">时间管理</a></li>
                        <li><a href="adminXishu.html">系数管理</a></li>
                    </ul>
                </nav>
       </div>
</body>
</html>