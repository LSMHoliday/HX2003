<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>课程管理-华信智原教师签课时系统</title>
<%@include file="/page/common/link.jsp" %>
</head>

<body>
<%@include file="/page/common/header.jsp" %>
<main id="main-wrap">
	<div id="container" class="clearfix neiye">
    	<div id="admin-wrap" class="fl">
           <%@include file="/page/common/content_title.jsp" %>
            <div class="adminschool-wrap">
            	<div class="add">
                	<form name="add" action="/course/addCourse.do" method="post">
                    	<input type="text" name='courseName' placeholder="输入新的课程名称">
                        <input type="submit" class="btn-add" value="添加新课程">
                    </form>
                </div>
                <form name="adminCourse" action="" method="post">
                	<table width="720" border="0" cellspacing="0" cellpadding="0">
					  <tr>
					    <th scope="col">序号</th>
					    <th scope="col">课程名称</th>
					    <th scope="col">操作</th>
					  </tr>
					  <c:forEach items="${courses}" var="o" varStatus="vs">
					  	<tr>
					  	 <td>${vs.count}</td>
					  	 <td>${o.courseName}</td>
					  	 <td><a href="javascript:;" class="change" cid="${o.id}">修改</a> <a cid="${o.id}" href="javascript:;" class="del">删除</a></td>
					  	 </tr>
					  </c:forEach>
					  
					</table>
          		</form>
            </div>
           <!--修改课程-->
           <div class="changeAllWrap hide">
               <div class="changeWrap">
                    <form name="changeCourse" action="/course/update.do" method="post">
                    	<input type="hidden" name='id' />
                        <input type="text" name='courseName'>
                        <input type="submit" value="确定修改" class="btn-submit" id="btn-submitCourse">
                    </form>
                    <i class="iconfont icon-close"></i>
               </div>
           </div>
            
        </div>
 		<%@include file="/page/common/body_right.jsp" %>
	</div>
</main>
<%@include file="/page/common/footer.jsp" %>
<script>
$(function(){
	//删除课程
	$('.del').click(function(){
		if(confirm('确定删除该课程吗？')){
			let cid=$(this).attr('cid');
			$(this).parents('tr').remove();
				window.location.href="/course/del.do?cid="+cid;
			}
		})
	//修改课程
	$('.change').click(function(){
		let cid=$(this).attr('cid');
		//设置id
		$("input[name='id']").val(cid);
		var $content=$(this).parent().prev().text();
		changePanel($content);
		})
	})
</script>
</body>
</html>
