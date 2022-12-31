<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="papa" method="post">
<table >
<tr>
	<td>Age</td>
	<td><input type="text" name="age"></td>
</tr>
<tr>
	<td>Name</td>
	<td><input type="text" name="name"></td>
</tr>
<tr>
	<td>Email</td>
	<td><input type="email" name="email"></td>
</tr>
<tr>
	<td>Gender</td>
	<td><input type="radio" name="gender" value="male">male<input type="radio" name="gender" value="female">female</td>
</tr>
<tr>
	<td>Country</td>
	<td>
		<select name="country">
		<option value="india">India</option>
		<option value="pakistan">Pakistan</option>
		<option value="uae">UAE</option>
		<option value="england">England</option>
		<option value="turkey">Turkey</option>
		</select>
	</td>
</tr>
<tr>
	<td>City</td>
	<td>
		<select name="city">
		<option value="mum">Mumbai</option>
		<option value="lah">Lahore</option>
		<option value="dub">Dubai</option>
		<option value="lon">London</option>
		<option value="istan">Istanbul</option>
		</select>
	</td>
</tr>
<tr>
	<td>Mobile No</td>
	<td><input type="text" name="number"></td>
</tr>
<tr>
	
	<td><input type="submit" ></td>
</tr>

</table>
</form>

</body>
</html>