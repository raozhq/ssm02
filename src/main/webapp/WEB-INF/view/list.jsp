<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/9/19
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="600" border="1">
    <tr>
        <th>ID</th><th>Name</th><th>Age</th><th>Addr</th>
    </tr>
    <!---->
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td><td>${user.name}</td><td>${user.age}</td><td>${user.addr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
