<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="domain.Person" scope="session"/>
	<jsp:setProperty property="*" name="person"/>

	<form action="success.jsp">
		<label>Miasto: <input type="taxt" id="address" name="address"/></label></br>
		<label>Kod pocztowy: <input type="text" id="zipCode" name="zipCode"/></label></br>
		<label>Ulica: <input type="text" id="street" name="street"/></label></br>
		<label>Nr domu: <input type="text" id="localNumber" name="localNumber"/></label></br>
		<label>Nr telefonu: <input type="text" id="phoneNumber" name="phoneNumber"/></label></br>
		<input type="submit" value="nastepny krok"/>
	</form>
</body>
</html>