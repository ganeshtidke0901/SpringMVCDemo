<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<body>
	<form:form method="GET" action="processform" modelAttribute="student">
		<!-- here firstName will call student.getFirstName() when it is loaded and student.setFirstName() when the form is submitted -->
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
		<br><br>
		Select Country <form:select path="country">
			<%-- <form:options items="${student.countryOptions}" --%> /> <!-- option-1 -->
			<form:options items="${countryList}" /> <!-- option-2 -->
			
			<%-- <form:option value="India" label="India" />
			<form:option value="Argentina" label="Argentina" /> --%>
		</form:select>
		<br><br>
		Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		C#<form:radiobutton path="favouriteLanguage" value="C#"/>
		PHP<form:radiobutton path="favouriteLanguage" value="PHP"/>
		nodejs<form:radiobutton path="favouriteLanguage" value="nodejs"/>
		<br><br>
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
				
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>