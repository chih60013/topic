<%@page import="java.util.ArrayList"%>
<%@page import="com.topic.bean.CateBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示所有類別</title>
</head>
<body>

<table border  ="1">
  <tr style="background-color:#a8fefa">
  <th>Cate_Num<th>Cate_Name<th>Cate_Desc<th>Cate_CDay<th>Cate_MDay
<%
ArrayList<CateBean> cates=(ArrayList<CateBean>)request.getAttribute("cates");
for(CateBean cate: cates){
%>
  	

  	
  <tr><td><%= cate.getCate_Num() %>
  <td><%=cate.getCate_Name() %>
  <td><%= cate.getCate_Desc() %>
  <td><%= cate.getCate_CDay() %>
  <td><%= cate.getCate_MDay() %>
  <td><form action="UpdateCate.jsp"><input type="button">修改</form>
  <td><form action="DeleteCate.jsp"><input type="button">刪除</form>
  <%} %>
  
  </table>
  <h3>共<%=cates.size() %>筆類別資料</h3>




</body>
</html>