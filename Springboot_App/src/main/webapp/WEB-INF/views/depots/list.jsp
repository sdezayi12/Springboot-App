<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<c:forEach items="${depots}" var="depot">
  <p>
      Location: ${depot.location}, Country: ${depot.owner} <a href="/buses?depot=${depot.id}">View Buses</a>
  </p>
</c:forEach>
</body>
</html>