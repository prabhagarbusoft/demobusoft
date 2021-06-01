<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Student</h3>

	<div id="Submit">
		<form:form action="/student/createStudent" method="post"
			>
			<p>
				<label>Enter Student name</label>
				<form:input path="name" />
			</p>
			<p>
				<label>Enter Student Age</label>
				<form:input path="age" />
			</p>
			<p>
            <label>Enter Student Address</label>
            <form:input path="address" required />
            </p>
            <p>
            <label>Enter Student Dept</label>
            <form:input path="dept" />
            </p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>


