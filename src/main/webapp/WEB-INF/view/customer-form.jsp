<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<title>Customer Registration Form</title>
		<style>
			.error {color:red}
		</style>
	</head>
<body>
	<fm:form action="processform" modelAttribute="customer">
	
	First Name: <fm:input path="firstName" />
	<br><br>
	Last Name(*): <fm:input path="lastName" />
				<fm:errors path="lastName" cssClass="error"/>
	<br><br>
	
	Free Passes			<fm:input path="freePasses"/>			
				<fm:errors path="freePasses" cssClass="error"/>
	<br><br>
	Postal Code 			<fm:input path="postalCode"/>			
				<fm:errors path="postalCode" cssClass="error"/>
	<br><br>
	Course Code 			<fm:input path="courseCode"/>			
				<fm:errors path="courseCode" cssClass="error"/>
	<br><br>
				<input type="submit" value="Submit"/>			
	</fm:form>
</body>
</html>