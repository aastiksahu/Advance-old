<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserRegistrationCtl" method="post">
		<table align="center">
			<tr>
				<th>First Name</th>
				<td><input type="text" name="firstName"
					placeholder="Enter First Name"></td>
			</tr>
			<tr>
				<th>Last Name</th>
				<td><input type="text" name="lastName"
					placeholder="Enter Last Name"></td>
			</tr>
			<tr>
				<th>Login id</th>
				<td><input type="text" name="loginId"
					placeholder="Enter Login Id"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password"
					placeholder="Enter password"></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" name="operation" value="SignUp"></td>
			</tr>
		</table>
	</form>

</body>
</html>