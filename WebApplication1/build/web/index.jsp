<%-- 
    Document   : index
    Created on : Jun 28, 2019, 2:55:42 AM
    Author     : Poozer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<?php $ javac InformationForm.java?php>-->

<html>
    <head>
        <title>Devin Poe's Servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h4>Clisk here to go to <a href="InformationForm">My Servlet Page</a></h4>
        <form action = "InformationForm" method = "POST" target="_blank">
            First name: <input type = "text" name = "first_name">
        <br/>
            Last Name: <input type = "text" name = "last_name" />
        <br/>
            Age: <input type = "text" name = "age" />
        
         <input type = "radio" name = "input" value = "Male" /> Male
         <input type = "radio" name = "input" value = "Female" /> Female
         <input type = "radio" name = "input" value = "Private"/> Private
         <input type = "submit" value = "Enter Information" />
      </form>
    </body>
</html>
