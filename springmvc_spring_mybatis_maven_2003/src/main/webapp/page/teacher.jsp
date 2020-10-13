<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>签课时-华信智原教师签课时系统</title>
<%@include file="/page/common/link.jsp" %>
</head>

<body>
<%@include file="/page/common/header.jsp"%>
<main id="main-wrap">
	<div id="container" class="clearfix neiye">
    	<div class="keshi-form fl">
        	<form name="keshi" method="post" action="/teacher/officiaSign.do">
        		<table width="840" border="0" cellspacing="0" cellpadding="10">
            <tr>
              <th>日期</th>
              <th>时间段</th>
              <th>班级</th>
              <th>地点</th>
              <th>节数</th>
              <th>备注</th>
            </tr>
            <tr>
              <td rowspan="2"><input type="text" id="select-date" name="selectDate" class="auto-kal"  data-kal="mode:'multiple',format:'YYYY-MM-DD'" autocomplete="off"></td>
              <td>
              <div class="check">
              <input type="checkbox" id="allday" name="allday" value="allday"><label for="allday" id="allday-label"><span>全天</span></label>
              </div>
              </td>
              <td rowspan="2">
              <div class="select-wrap">
              <select id="select-class" name="grades">
           		<c:forEach items="${grades}" var="gs">
           			<option value='${gs.gradename}'>${gs.gradename}</option>
           		</c:forEach>
              </select>
              </div></td>
              <td rowspan="2">
              <div class="select-wrap">
              <select id="classroom" name="room">
        		<c:forEach items="${rooms}" var="rs">
           			<option value='${rs.roomName}'>${rs.roomName}</option>
           		</c:forEach>
              </select>
              </div>
              </td>
              <td rowspan="2">
              <div class="select-wrap">
              <select id="count" name="lesssions">
				<c:forEach begin="1" end="8" step="1" var="sk">
           			<option value='${sk}'>${sk}</option>
           		</c:forEach>
              </select>
              </div></td>
              <td>
              <div class="check">
              <input type="checkbox" id="zhiban" name="onduty" value="1"><label for="zhiban"><span>值班</span></label>
              </div>
              </td>
            </tr>
            <tr>
              <td class="center">
	              <div class="select-wrap">
		              <select id="start-time" name="begintime">
		  				<c:forEach items="${times}" var="ts">
		           			<option value='${ts.lessionTime}'>${ts.lessionTime}</option>
		           		</c:forEach>
		              </select>
		           </div>
	              <span class="splite-time">到</span><div class="select-wrap">
	              <select id="end-time" name="endtime">
	              	<c:forEach items="${times}" var="ts">
	              		<c:if test="${ts.lessionTime eq '17:30'}">
	              			<option value='${ts.lessionTime}' selected='selected'>${ts.lessionTime}</option>
	              		</c:if>
	              		<c:if test="${ts.lessionTime ne '17:30'}">
	              			<option value='${ts.lessionTime}'>${ts.lessionTime}</option>
	              		</c:if>
	           		</c:forEach>
	              </select>
              </div>
              </td>
              <td><label for="beizhu"><span class="sub-info">其他信息请注明：</span></label><br><input type="text" id="beizhu" name="remark"></td>
            </tr>
          </table>
          <div id="submit-wrap" class="center">
          	<input type="submit" value="点击确定" class="btn-submit" id="btn-listSubmit">
          </div>
         	</form>
            <div class="info">
            	<strong>温馨提示：</strong>
                <p>1、日期可以多选，上课班级一致的课时可以多选日期实现一键签所有课时。</p>
                <p>2、勾选全天后，上午下午的课时一起签。</p>
                <p>3、如果当前上下午课时不一样，请当天单独选择时间段签课时。</p>
            </div>
      	</div>
      	<%@include file="/page/common/teahcer_right.jsp"%>
	</div>
</main>
<%@include file="/page/common/footer.jsp"%>
</body>
</html>
