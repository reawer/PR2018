<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Welcome back,Hero!</title>
<body>
	<h2>Congratulations!</h2>
	<h3>欢迎，${user.username }，您已经成功登录！</h3>


	<c:if test="${euserList!= null && fn:length(euserList) > 0}">
		<table border="1">
			<tbody>
				<tr>
					<th>姓名</th>
					<th>年龄</th>
					<th>编辑时间</th>
					<th>快捷操作</th>
				</tr>
				<c:forEach items="${euserList}" var="euser">
					<tr>
						<td>${euser.username}</td>
						<td>${euser.userage}</td>
						<td><fmt:formatDate value='${euser.updateTime}' pattern='yyyy-MM-dd HH:mm:ss'/></td>
						<td><a href="getUser?id=${euser.userid}">编辑</a>&nbsp; <a
							href="javascript:del('${euser.userid}')">删除</a></td>
						<%-- <td>${euser.username}</td>
						<td>${euser.userage}</td>
						<td>${euser.updateTime}</td>
						<td><a href="user/getUser?id=${euser.userid}">编辑</a> <a
							href="javascript:del('${euser.userid}')">删除</a></td> --%>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
	<c:if test="${euserList== null || fn:length(euserList) == 0}">
                数据为空  
            </c:if>

</body>
</html>
