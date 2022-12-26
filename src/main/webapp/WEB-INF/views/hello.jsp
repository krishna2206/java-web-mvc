<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello world</title>
        <script type="text/javascript" src="assets/js/script.js"></script>
    </head>
    <body>
        <h1><%= request.getAttribute("data") %></h1>
        <p>This project is a simple example of a web application using the MVC pattern.</p>
        <button onclick="hello()">Click me</button>
    </body>
</html>
