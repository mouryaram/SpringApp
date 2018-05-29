<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>

</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
FirstName: <form:input path="firstName"/> 
<br><br>
LastName: <form:input path="lastName"/>
<br><br>
Country: <form:select path="country">
<form:options items="${student.countryOptions}"/>


</form:select>
<br>
<br>
Favorite Language:
 <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions }"/>
<br><br>
Operating Systems:
Linux <form:checkbox path="operatingSystems" value="Linux"/>
Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
<br><br>
<input type="submit"/>
</form:form>
</body>
</html>