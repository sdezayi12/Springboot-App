<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<%--@elvariable id="depot" type=""--%>
<form:form action="/addDepot" modelAttribute="depot">
    ID:
    <form:input path="id"/>
    Location:
    <form:input path="location"/>
    Owner:
    <form:input path="owner"/>
    <input type="submit"/>
</form:form>
</body>
</html>