
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Kenedid
  Date: 14-04-2017
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Turtle</title>
  </head>
  <body>

  <h1>Welcome to Turtle</h1>
  <p> Here is the datae for today</p>
<%
  Date date = new Date();
  out.print("<h2>"+date.toString()+ "</h2>");

%>
  </body>
</html>
