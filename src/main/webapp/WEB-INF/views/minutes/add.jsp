<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${ title }</title>
</head>
<body>
	<h1>${ title }</h1>
	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="goal.text"/></td>
				<td><form:input path="minutes" /></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<button type="submit">Enter Exercise</button>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>