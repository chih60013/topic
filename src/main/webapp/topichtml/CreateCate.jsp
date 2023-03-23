<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${newcate.cate_Name} 類別新增成功   
<!-- 來自get  get去除 Cate_Name的c改小寫 (來自講義) -->
<!-- 此方式為el方式取值 -->



	<div>
		<a href="../topichtml/ShowAllCateFinish.jsp"><button>返回所有類別</button></a>
	</div>

</body>
</html>