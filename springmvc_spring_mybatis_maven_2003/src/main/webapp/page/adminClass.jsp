<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>班级管理-华信智原教师签课时系统</title>
<%@ include file="${pageContext.request.contextPath}/page/common/link.jsp" %> 
</head>
<body>
<%@ include file="${pageContext.request.contextPath}/page/common/header.jsp" %> 
<main id="main-wrap">
	<div id="container" class="clearfix neiye">
    	<div id="admin-wrap" class="fl">
    	<%@ include file="${pageContext.request.contextPath}/page/common/nav.jsp" %> 
            <div class="adminschool-wrap">
            	<div class="add">
                	<form name="add" action="" method="post">
                    	<input type="text" placeholder="输入新的班级名称">
                        <input type="submit" class="btn-add" value="添加新班级">
                    </form>
                </div>
                <form name="adminClass" action="" method="post">
                	<table id="showlist" width="720" border="0" cellspacing="0" cellpadding="0">
					  <tr>
					    <th scope="col">ID</th>
					    <th scope="col">班级名称</th>
					    <th scope="col">操作</th>
					  </tr>
					</table>
                </form>
            </div>
           <!--修改班级-->
           <div class="changeAllWrap hide">
               <div class="changeWrap">
                
                    <form name="changeClass" action="" method="post">
                        <input type="text">
                        <input type="submit" value="确定修改" class="btn-submit" id="btn-submitClass">
                    
                    </form>
                    <i class="iconfont icon-close"></i>
               </div>
           </div>
            
        </div>
        <aside class="fr">
        	<div id="slidebar" class="fr">
                <div id="teacher-info">
                    <div id="touxiang">
                        <a href="#"><img src="images/touxiang.jpg" alt="管理员头像"></a></div>
                    <h1 class="center">汪帆</h1>
                </div>
                <%@ include file="${pageContext.request.contextPath}/page/common/body_right.jsp" %> 
                
            </div>
        </aside>
	</div>
</main>
<%@ include file="${pageContext.request.contextPath}/page/common/footer.jsp" %> 
<script>
$(function(){
	//删除班级
	$('.del').click(function(){
		if(confirm('确定删除该班级吗？')){
			$(this).parents('tr').remove();
			}
		})
		
	//修改班级
	$('.change').click(function(){
		var $content=$(this).parent().prev().text();
		changePanel($content);
		})
	})
</script>
</body>
</html>
