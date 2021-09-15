<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://egovframework.gov/ctl/ui" prefix="ui" %>
<%@ taglib uri=""%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
* 등록폼 
<form action="/temp/insert.do" method="post" name="frn" >
 	<label for="tempVal">값 정보:</label>
 	<input type="text" id="tempVal" name="tempVal">
 	<br/>
 	<button type="submit">등록</button>
</form>
</body>
</html>