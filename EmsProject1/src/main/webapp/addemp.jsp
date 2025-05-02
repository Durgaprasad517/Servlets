<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
<h2>Add Employee</h2>
<div>
<form action="./addemp1" method="post">
<div>
<label>NAME</label>
<input type="text" name="name">
</div>
<div>
<label>SALARY</label>
<input type="text" name="salary">
</div>
<div>
<label>MOBILE</label>
<input type="text" name="mobile">
</div>
<div>
<label>EMAIL</label>
<input type="text" name="email">
</div>
<div>
<input type="submit" value="ADD EMPLOYEE" >
<input type="reset" value="Reset" >
</div>
</form>
</div>
</body>
<jsp:include page="fotter.jsp"></jsp:include>

</html>