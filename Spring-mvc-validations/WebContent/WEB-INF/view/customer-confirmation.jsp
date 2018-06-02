<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>
Confirmation Page
</title></head>
<body bgcolor="lightyellow">
The Customer is Confirmed : ${customer.firstName }  ${customer.lastName }
<br><br>
Free Passes :${customer.freePasses }
<br><br>
Postal Code:${customer.postalCode }
<br><br>
Course Code:${customer.courseCode}
</body>
</html>