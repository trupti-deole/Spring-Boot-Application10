<%@page import="com.example.demo.model.Student"%>
<html>
<head>
<title>Edit</title>
</head>
<body>

	<%Student st=(Student)request.getAttribute("data"); %>
	<form action="edit">
	  Rollno:<input type="number" name="rollno" value=<%= st.getRollno() %>><br>
	  Name:<input type="text" name="name" value=<%= st.getName() %>><br>
	  Marks:<input type="number" name="marks" value=<%= st.getMarks() %>><br>
	  Address:<input type="text" name="address" value=<%= st.getAddress() %>><br>
	  Ph no:<input type="number" name="phno" value=<%= st.getPhno() %>><br>
	  User Name:<input type="text" name="uname" value=<%= st.getUname() %>><br>
	  Password:<input type="password" name="pass" value=<%=st.getPass() %>><br>
	  <input type="submit" value="Submit">
	</form>
</body>
</html>