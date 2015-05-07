<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<h1>Login</h1>
		<form:form modelAttribute="user" method="POST" action="login.html">
			Login: <form:input path="login"/><br /><br />
		
			Password: <form:input path="password" type="password"/><br /><br />
			
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>