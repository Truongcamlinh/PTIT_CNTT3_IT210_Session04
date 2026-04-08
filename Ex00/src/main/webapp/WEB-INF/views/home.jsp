<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Restaurant Home</title>
</head>
<body>
<h1>${message}</h1>
<p>Sample menu:</p>
<ul>
    <c:forEach var="order" items="${orders}">
        <li><c:out value="${order}"/></li>
    </c:forEach>
</ul>
<p><a href="${pageContext.request.contextPath}/legacy">Go to legacy page</a></p>
</body>
</html>

