<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Новости</title>
</head>
<body>
<div>
    <table>
        <thead>
        <th>Description</th>
        <th>Created</th>
        </thead>
        <c:forEach items="${allToDos}" var="todo">
            <tr>
                <td>${todo.description}</td>
                <td>${todo.created}</td>
<%--                <td>--%>
<%--                    <form action="${pageContext.request.contextPath}/admin" method="post">--%>
<%--                        <input type="hidden" name="userId" value="${todo.id}"/>--%>
<%--                        <input type="hidden" name="action" value="delete"/>--%>
<%--                        <button type="submit">Delete</button>--%>
<%--                    </form>--%>
<%--                </td>--%>
            </tr>
        </c:forEach>
    </table>
    <a href="/">Главная</a>
</div>
</body>
</html>
