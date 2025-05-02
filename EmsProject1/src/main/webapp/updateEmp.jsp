<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<h2>Update Employee</h2>
<div>
<form action="./updateemp" method="post">
<div>
<label>ID</label>
<input type="text" name="id" value="${hai.id}" readonly="readonly">
</div>
<div>
<label>NAME</label>
<input type="text" name="name" value="${hai.name}">
</div>
<div>
<label>SALARY</label>
<input type="text" name="salary" value="${hai.salary}">
</div>
<div>
<label>MOBILE</label>
<input type="text" name="mobile" value="${hai.mobile}">
</div>
<div>
<label>EMAIL</label>
<input type="text" name="email" value="${hai.email}">
</div>
<div>
<input type="submit" value="UPDATE EMPLOYEE" >
</div>
</form>     
</div>
</body>
<jsp:include page="fotter.jsp"></jsp:include>

</html>