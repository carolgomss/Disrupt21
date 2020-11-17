
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Back To The Future</title>
</head>
<body>
	<table>
		<c:forEach items="${personagens}" var="personagem">
			<tr>
				<td>${personagem.id}</td>
				<td><c:out value="${personagem.nome}"/></td>
				<td><c:out value="${personagem.descricao}"/></td>
			</tr>
		</c:forEach>		
	</table>
</body>
</html>