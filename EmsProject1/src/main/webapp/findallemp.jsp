<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>

<body>
<h2>FIND EMPLOYEES</h2>
<div>
<table border="2px">
<tr>
<th>Id</th>
<th>NAME</th>
<th>SALARY</th>
<th>MOBILE</th>
<th>EMAIL</th>
<th>UPDATE</th>
<th>DELETE</th>
</tr>
<c:forEach items="${hello}" var="item">
<tr>
<td><c:out value="${item.id}"></c:out></td>
<td><c:out value="${item.name}"></c:out></td>
<td><c:out value="${item.salary}"></c:out></td>
<td><c:out value="${item.mobile}"></c:out></td>
<td><c:out value="${item.email}"></c:out></td>
<td><a href="./updateemp?id=${item.id}">Update</a></td>
<td><a href="./deleteEmpById?id=${item.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
<jsp:include page="fotter.jsp"></jsp:include>

</html>