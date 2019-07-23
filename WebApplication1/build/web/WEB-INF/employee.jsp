<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   </head>
   <body>
      <h1>Selected radio</h1>
      <table cellpadding="1"  cellspacing="1" border="1" bordercolor="gray">
         <tr>
            <td>Name</td>
         </tr>
         <%
            List<String> employees  = (List<String>)request.getAttribute("names");
            for(String e: employees){
            %>
         <tr>
            <td><%=e%></td>
         </tr>
         <% 
            }
            %>
      </table>
   </body>
</html>