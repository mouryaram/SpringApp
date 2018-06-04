<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>
SignUp Form
</title>
</head>
<body bgcolor="lightYellow">
<form:form action="confirmationPage" modelAttribute="signUpPage">
FirstName : <form:input path="firstName"/>
<br><br>
LastName  : <form:input path="lastName"/>
<br><br>
Age       : <form:input path="age"/>
<br><br>
Email     : <form:input path="email"/>
<br><br>
phoneNumber : <form:input path="phoneNumber"/>
<br><br>
Gender      : <form:input path="gender"/>
<br><br>
Password : <form:input type="password" path="password"/>
<br><br>
<input type="submit" value="submit"/>

</form:form>
</body>
</html>