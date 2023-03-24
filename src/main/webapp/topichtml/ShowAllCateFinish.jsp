<%@page import="java.util.ArrayList"%>
<%@page import="com.topic.bean.CateBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示所有類別</title>



<script>
function updateCate(form) {
  var cateNum = form.elements["cateNum"].value;
  // 使用 JavaScript 取得要修改的類別序號，並將其傳遞給表單中的隱藏 input 標籤
  form.submit();
}
</script>
</head>
<body>

<table border  ="1">
  <tr style="background-color:#a8fefa">
  <th>Cate_Num<th>Cate_Name<th>Cate_Desc<th>Cate_CDay<th>Cate_MDay
<%
ArrayList<CateBean> cates=(ArrayList<CateBean>)request.getAttribute("cates");
for(CateBean cate: cates){
%>
 <c:forEach items="${cates}" var="m">   </c:forEach> 
 	

  	
  <tr>
  <td>類別序號<td><%= cate.getCate_Num() %>
  <td>類別名稱<td><%=cate.getCate_Name() %>
  <td>類別敘述<td><%= cate.getCate_Desc() %>
  <td>類別創立日期<td><%= cate.getCate_CDay() %>
  <td>類別修改日期<td><%= cate.getCate_MDay() %>

    
    
  
  
  
	<div>
		<a href="${pageContext.request.contextPath}/GetCateByNumForUpdate?CateNum=<%= cate.getCate_Num() %>"><button>修改</button></a>
	</div> 
  
  <%} %>
  
  </table>
  <h3>共<%=cates.size() %>筆類別資料</h3>



</body>
</html>