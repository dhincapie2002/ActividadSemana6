<%-- 
    Document   : Hospital
    Created on : 1/10/2022, 11:07:44 AM
    Author     : dshc-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de pacientes por Hospital</title>
    </head>
    <a href="index.html">[Volver]</a>
    <body>
        <%@ page import = "salud.Hospital" %>
        <%@ page import = "salud.Imprimir" %>
        <%@ page import = "salud.ListaPaciente" %>
        <%
             Imprimir hospital = new Hospital();    
        %>
        <p>Lista de pacientes por Hospital</p>
        <p><%= hospital.impresion() %></p>
        <br>
        <a href="index.html">[Volver]</a>
    </body>
</html>
