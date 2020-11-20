<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Back To The Future - Eventos</title>
</head>
<body>
teste
	<table>
		<c:forEach items="${eventos}" var="eventos">
			<tr>
				<td>${eventos.id}</td>
				<td><c:out value="${personagem.titulo}"/></td>
				<td><c:out value="${personagem.descricao}"/></td>
				<td><c:out value="${personagem.data}"/></td>
			</tr>
		</c:forEach>		
	</table>
</body>
</html>