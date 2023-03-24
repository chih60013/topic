<%@page import="java.util.ArrayList"%>
<%@page import="com.topic.bean.CateBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示是否刪除類別</title>
</head>
<body>


  ${isDeleteSuccess}
  
  
  	<div style="text-align: center;">

		<a href="Delete.html" class="button">刪除</a>
		<a href="../ShowAllCate" class="button">返回所有類別</a>
	</div>



</body>
</html>