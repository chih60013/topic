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
<title>修改單一類別</title>
</head>
<body>

<form method="post" action="./UpdateCateChih">
    <label for="cateNum">類別序號</label>
    <input type="text" name="cateNum" value="${cate.cate_Num}"/>
    <div>
        <label for="cateName">類別名稱</label>
        <input type="text" name="cateName" value="${cate.cate_Name}"/>
    </div>
    <div>
        <label for="cateDesc">類別描述</label>
        <textarea name="cateDesc" >${cate.cate_Desc}</textarea>
    </div>
    <div>
        <label for="cateCDay">建立日期</label>
        <input type="text" name="cateCDay" value="${cate.cate_CDay}"/>
    </div>
    <div>
        <label for="cateMDay">修改日期</label>
        <input type="text" name="cateMDay" value="${cate.cate_MDay}"/>
    </div>
    <input type="submit" value="修改"/>
  
  <div>
	</div>
</form>
		<a href="ShowAllCate"><button>返回所有類別</button></a>

</body>
</html>