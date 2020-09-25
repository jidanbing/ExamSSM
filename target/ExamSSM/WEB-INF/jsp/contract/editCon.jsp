<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑合同信息</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/contract/updateCon.action">
		<input type="text" name="id" value="${contract.id }" style="display: none">
		<table>
			<tr>
				<td>合同编号:<input type="text" name="c_no" value="${contract.c_no }"></td>
				<td>签订时间:<input type="date" name="c_createtime" value="<fmt:formatDate value="${contract.c_createtime }" pattern="yyyy-MM-dd"/>"/></td>				
			</tr>
			<tr>			
				<td>生效时间:<input type="date" name="c_taketime" value="<fmt:formatDate value="${contract.c_taketime }" pattern="yyyy-MM-dd"/>"/></td>				
				<td>过期时间:<input type="date" name="c_overtime" value="<fmt:formatDate value="${contract.c_overtime }" pattern="yyyy-MM-dd"/>"/></td>				
			</tr>
			<tr>
				<td>租金:<input type="text" name="c_rental" value="${contract.c_rental }"></td>
				<td>押金:<input type="text" name="c_cash" value="${contract.c_cash }"></td>
			</tr>
			<tr>
				<td>签订人:<input type="text" name="c_name" value="${contract.c_name }"></td>
			</tr>					
		</table>
		<input type="submit" value="修改">
	</form>
</body>
</html>