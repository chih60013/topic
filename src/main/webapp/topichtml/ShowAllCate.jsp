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
  	

  	
  <tr>
  <td>類別序號<td><%= cate.getCate_Num() %>
  <td>類別名稱<td><%=cate.getCate_Name() %>
  <td>類別敘述<td><%= cate.getCate_Desc() %>
  <td> 類別創立日期<td><%= cate.getCate_CDay() %>
  <td>類別修改日期<td><%= cate.getCate_MDay() %>
  <td><form action="UpdateCate.jsp"><input type="button">修改</form>
  <td><form action="DeleteCate.jsp"><input type="button">刪除</form>
  
  
  <tr>
	<td>類別序號<%= cate.getCate_Num() %><td>
	<td>類別名稱<td>
	<td>類別敘述<td>
	<td>類別創立日期<td>
	<td>類別修改日期<td>
</tr>
  
  
  <%} %>
  
  </table>
  <h3>共<%=cates.size() %>筆類別資料</h3>





<tr>
	<td>類別序號<td>
	<td>類別名稱<td>
	<td>類別敘述<td>
	<td>類別創立日期<td>
	<td>類別修改日期<td>
</tr>


</body>
</html>