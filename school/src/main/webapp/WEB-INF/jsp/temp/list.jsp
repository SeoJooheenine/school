<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<table>
	<thead>
		<tr>
			<th>TEMP_ID</th>
			<th>TEMP_VAL</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="item" items="${list}">
		<tr>
			<td>${item.tempId}</td>
			<td>${item.tempVal}</td>
		</tr>				
	</c:forEach>
	</tbody>
</table>
</div>
</form>
</body>
</html>