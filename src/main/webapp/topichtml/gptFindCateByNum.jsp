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
<title>顯示單一類別</title>
<style>
    .container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
css
Copy code
form {
    border: 2px solid #ccc;
    padding: 20px;
    border-radius: 10px;
    width: 500px;
    font-family: Arial, Helvetica, sans-serif;
    background-color: #f2f2f2;
}

input[type=text], textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    margin-top: 6px;
    margin-bottom: 16px;
    resize: vertical;
}

label {
    font-weight: bold;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #45a049;
}
</style>
</head>
<body>
<div class="container">
    <form>
        <label for="cateNum">類別序號</label>
        <input type="text" name="cateNum" value="${cate.cate_Num}" readonly/>
        <div>
            <label for="cateName">類別名稱</label>
            <input type="text" name="cateName" value="${cate.cate_Name}" readonly/>
        </div>
        <div>
            <label for="cateDesc">類別描述</label>
            <textarea name="cateDesc" readonly>${cate.cate_Desc}</textarea>
        </div>
        <div>
            <label for="cateCDay">建立日期</label>
            <input type="text" name="cateCDay" value="${cate.cate_CDay}" readonly/>
        </div>
        <div>
            <label for="cateMDay">修改日期</label>
            <input type="text" name="cateMDay" value="${cate.cate_MDay}" readonly/>
        </div>
        <a href=""></a> <button>修改</button>
        <a href=""></a> <button>刪除</button>
        <div>
            <a href="${pageContext.request.contextPath}/ShowAllCate"><button>返回所有類別</button></a>
        </div>
    </form>
</div>
</body>
</html>