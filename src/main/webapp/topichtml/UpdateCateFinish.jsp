<%@page import="java.util.ArrayList"%>
<%@page import="com.topic.bean.CateBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示是否更新類別</title>
</head>
<body>


  是否更新成功呢? ${isUpdateSuccess}
  <div>
		<a href="${pageContext.request.contextPath}/ShowAllCate"><button>返回所有類別</button></a>
	</div>


</body>
</html>