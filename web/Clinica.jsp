<%-- 
    Document   : Clinica
    Created on : 1/10/2022, 11:03:35 AM
    Author     : dshc-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de pacientes por Clinica</title>
    </head>
    <a href="index.html">[Volver]</a>
    <body>
        <%@ page import = "salud.Clinica" %>
        <%@ page import = "salud.Imprimir" %>
        <%@ page import = "salud.ListaPaciente" %>
        <%
             Imprimir clinica = new Clinica();    
        %>
        <p>Lista de pacientes por Clinica</p>
        <p><%= clinica.impresion() %></p>
        <br>
        <a href="index.html">[Volver]</a>
    </body>
</html>
