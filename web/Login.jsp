<%--
  Created by IntelliJ IDEA.
  User: Kenedid
  Date: 14-04-2017
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Turtle Login</title>
</head>


<body>

    <h1>Login as a user</h1>

   <form action="/Login" method="post">
       login-name: <input type="text" name=loginname width="30"/>
       Password: <input type="password" name=password width="30"/>
       <input type="submit" value="Login"/>
   </form>

    <p style="color: red;" ${Wringinfo}<p/>


</body>
</html>
