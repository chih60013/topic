<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.button {
  background-color: #5DD39E;
  color: white;
  padding: 12px 24px;
  text-align: center;
  text-decoration: none;
  display: block;
  font-size: 16px;
  margin: 10px 5px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
}

.button:hover {
  background-color: #3e8e41;
}

.sidebar {
  height: 100%;
  width: 200px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #f5f5f5;
  overflow-x: hidden;
  padding-top: 20px;
}

.sidebar a {
  display: block;
  color: #333;
  padding: 10px 15px;
  text-decoration: none;
  font-size: 16px;
}

.sidebar a:hover {
  background-color: #ddd;
}
</style>
</head>
<body>

<div class="sidebar">
  <a href="CreateCate.html" class="button">新增</a>
  <a href="Update.html" class="button">修改</a>
  <a href="Delete.html" class="button">刪除</a>
  <a href="FindOneCateFirst.html" class="button">查詢單筆</a>
  <a href="../ShowAllCate" class="button">查詢所有類別</a>
</div>

</body>
</html>