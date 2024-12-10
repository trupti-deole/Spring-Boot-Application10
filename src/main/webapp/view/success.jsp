<%@page import="com.example.demo.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Register Info</title>
<script>

  function deleteData()
  {
	  alert("You are going to delete data");
	  document.myform.action="delete";
	  document.myform.submit();
  } 
  function updateData()
  {
	  alert("You are going to update records...")
	  document.myform.action="update";
	  document.myform.submit();
  }
</script>
</head>
<body>
	<h2>Welcome to CJC!</h2>
	

	<%--For displaying in tabular format --%>
	<%
		List<Student> st = (List<Student>) request.getAttribute("data");
	
	
	%>
	
	<form name="myform">
	  <table border="2">
		<thead>
			<tr>
				<th>select</th>
				<th>Roll no</th>
				<th>user name</th>
				<th>Marks</th>
				<th>address</th>
				<th>phno</th>
				<th>uname</th>
				<th>pass</th>
			</tr>
			
		</thead>
		<tbody>


			<%
				for (Student s : st) {
			%>
			
			<tr>
			    <td><input type="radio" name="rollno" value="<%=s.getRollno()%>"></td>
				<td><%=s.getRollno()%></td>
				<td><%=s.getName() %></td>
				<td><%=s.getMarks() %></td>
				<td><%=s.getAddress()%></td>
				<td><%=s.getPhno() %></td>
				<td><%=s.getUname() %></td>
				<td><%=s.getPass() %></td>
				
			</tr>


			<%
				}
			%>


		</tbody>
		<button onclick="deleteData()">Delete</button>  
		<button onclick="updateData()">Update</button>
	</table>
	</form>
</body>
</html>