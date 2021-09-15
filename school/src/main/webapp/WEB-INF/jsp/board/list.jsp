<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 리스트</title>
</head>
<body>
	<div>
		<h2>게시글 목록</h2>
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>VAL</th>
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
</body>
</html>