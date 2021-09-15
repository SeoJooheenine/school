<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://egovframework.gov/ctl/ui" prefix="ui" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 가져어기</title>
<link>
</head>
<body>
<div style="width:500px; margin:50px auto;">
	게시물 총 수 : <c:out value="${paginationInfo.totalRecordCount}"/>
	<table>
		<caption> <!-- caption table에 대한 설명  -->
			이 표는  TEMP_ID, TEMP_VAL로 구성되어있는 표
		</caption>
		<thead>
			<tr>
				<th>TEMP_ID</th>
				<th>TEMP_VAL</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="result" items="${resultList}">
				<tr>
					<td><c:out value="${result.tempId}"></c:out></td>
					<td>
						<c:url var="viewUrl" value="/temp/select.do">
							<c:param name="tempId" value="${result.tempId}"></c:param>
						</c:url>
						<a href="${viewUrl}">
							<c:out value="${result.tempVal}"></c:out>
						</a>
					</td>
					<td>
						<c:url val="delUrl" value="/temp/delete.do">
							<c:param name="tempId" value="${result.tempId}"/>
						</c:url>
						<a href="${delUrl}" class="btn-del">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div id="paging_div">
		<ul class="paging_align">
			<c:url var="pageUrl" value="/temp/selectList.do"></c:url>
			<c:set var="pagingParam"><c:out value="${pageUrl}"></c:out></c:set>
			<ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="${pagingParam}"/>
		</ul>
	</div>
	<button type="button" id="btn-reg" data-href="/temp/tempRegist.do">등록하기</button>
	<script>
		$(document).ready(function(){
			$("#btn-reg").click(function(){
				location.href = $(this).data("href");
			});
			
			$(".btn-del").click(function(){
				if(!confirm("삭제하시겠습니까")){
					 return false;
				}
			});
		});
	</script>
</div>
</body>
</html>