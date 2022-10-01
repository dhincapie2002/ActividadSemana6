<%-- 
    Document   : Centro
    Created on : 1/10/2022, 11:28:45 AM
    Author     : dshc-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de pacientes por Centro de Salud</title>
    </head>
    <a href="index.html">[Volver]</a>
    <body>
        <%@ page import = "salud.Centro" %>
        <%@ page import = "salud.Imprimir" %>
        <%@ page import = "salud.ListaPaciente" %>
        <%
             Imprimir centro = new Centro();    
        %>
        <p>Lista de pacientes por Centro de Salud</p>
        <p><%= centro.impresion() %></p>
        <br>
        <a href="index.html">[Volver]</a>
    </body>
</html>
