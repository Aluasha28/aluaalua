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
        <th>Id</th>
        <th>Topic</th>
        <th>Description</th>
        <th>Created</th>
        </thead>
        <c:forEach items="${allToDos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.topic}</td>
                <td>${todo.description}</td>
                <td>${todo.created}</td>
                <td>
                    <sec:authorize access="hasRole('ADMIN')">
                            <form action="${pageContext.request.contextPath}/news/delete" method="post">
                                <input type="hidden" name="todoId" value="${todo.id}"/>
                                <input type="hidden" name="action" value="deletetodo"/>
                                <button type="submit">Delete</button>
                            </form>
                    </sec:authorize >
                    </c:forEach>
                </td>
<%--                <td>--%>
<%--                    <c:forEach items="${allUsers}" var="user">--%>
<%--                    <c:when test="${user.roles == ROLE_ADMIN}">--%>
<%--                    <form action="${pageContext.request.contextPath}/news" method="post">--%>
<%--                        <input type="hidden" name="todoId" value="${todo.id}"/>--%>
<%--                        <input type="hidden" name="action" value="deletetodo"/>--%>
<%--                        <button type="submit">Delete</button>--%>
<%--                    </form>--%>
<%--                    </c:when>--%>
<%--                    </c:forEach>--%>
<%--                </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
    </table>
    <a href="/">Главная</a>
</div>





<%--<div>--%>
<%--    <form:form method="POST" modelAttribute="todoForm">--%>
<%--        <h2>add task</h2>--%>
<%--        <div>--%>
<%--            <form:input type="text" path="description" placeholder="description"--%>
<%--                        autofocus="true"></form:input>--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <form:input type="text" path="created" placeholder="created"></form:input>--%>
<%--        </div>--%>
<%--        <div>--%>
<%--            <form:input type="integer" path="id" placeholder="id"></form:input>--%>
<%--        </div>--%>
<%--        <button type="submit">add</button>--%>
<%--    </form:form>--%>
<%--    <a href="/">Главная</a>--%>
<%--</div>--%>
</body>
</html>
