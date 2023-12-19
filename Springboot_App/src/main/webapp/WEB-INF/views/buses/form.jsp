<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<form:form action="/addBus" modelAttribute="bus">
    <input type="hidden" name="depot" value="${depotId}" />
    <form:label path="manufacturer">Manufacturer:</form:label>
    <form:input path="manufacturer"/>
    <form:label path="driver">Driver:</form:label>
    <form:input path="driver"/>
    <form:label path="city">City:</form:label>
    <form:input path="city"/>
    <form:label path="route">Route:</form:label>
    <form:input path="route"/>
    <input type="submit"/>
</form:form>
</body>
</html>