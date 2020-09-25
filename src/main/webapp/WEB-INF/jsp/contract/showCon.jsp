<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>展示合同信息</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>合同编号</th>
			<th>签订时间</th>
			<th>生效时间</th>
			<th>过期时间</th>
			<th>租金</th>
			<th>押金</th>			
			<th>签订人</th>
			<th>编辑</th>
			<th>删除</th>
		</tr>
			<c:forEach items="${cons }" var="contract">
				<tr>
					<td>${contract.c_no }</td>
					<td><fmt:formatDate value="${contract.c_createtime }" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${contract.c_taketime }" pattern="yyyy-MM-dd"/></td>
					<td><fmt:formatDate value="${contract.c_overtime }" pattern="yyyy-MM-dd"/></td>
					<td>${contract.c_rental }</td>
					<td>${contract.c_cash }</td>
					<td>${contract.c_name }</td>
					<td><a href="${pageContext.request.contextPath }/contract/toUpdateCon.action?id=${contract.id}">编辑</a></td>
					<td><a href="${pageContext.request.contextPath }/contract/deleteCon.action?id=${contract.id}">删除</a></td>
				</tr>
				
			</c:forEach>
		
	
	</table>
</body>
</html>