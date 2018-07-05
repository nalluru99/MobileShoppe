<%@ page import="java.util.Set,com.Mobile.Mobile" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ControlServlet">
<table background="YELLOW" border="2"> 
	<th>ID</th>
	<th>Cost</th>
	<th>OS</th>
	<th>Brand</th>
	<th>Style</th>
	<th>Display</th>
	<th>Quantity</th>
	<th>Add to Cart</th>

	<%
	   Set<Mobile> mobiles = (Set<Mobile>)request.getAttribute("MobileSet");
	   for(Mobile m : mobiles){	

	%>
	<tr>
		<td><%out.println(m.getId());%></td>	
		<td><%out.println(m.getCost());%></td>	
		<td><%out.println(m.getOS());%></td>
		<td><%out.println(m.getBrand());%></td>
		<td><%out.println(m.getStyle());%></td>
		<td><%out.println(m.getStyle());%></td>
		<td><%out.println(m.getQuantity());%></td>
        <input type="hidden" name="do" value="gotocart"/>
		<td><button type="submit" class="btn">Select</button><td>
	</tr>

	<% } %>
</table>
</form>
</body>
</html>