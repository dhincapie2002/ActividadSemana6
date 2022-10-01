<%-- 
    Document   : Ingresar
    Created on : 1/10/2022, 02:28:05 PM
    Author     : dshc-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar paciente</title>
    </head>
    <a href="index.html">[Volver]</a>
    <body>
        <form action="" method="POST">
            <table>
                <tr>
                    <td>Codigo:</td>><<td><input type="text" placeholder="codigo" name="codigo"/></td>
                </tr>
                <tr>
                    <td>Nombre:</td>><<td><input type="text" placeholder="nombre" name="nombre"/></td>
                </tr>
                <tr>
                    <td>Apellido:</td>><<td><input type="text" placeholder="apellido" name="apellido"/></td>
                </tr>
                <tr>
                    <td>Sexo:</td>><<td><input type="text" placeholder="femenino o masculino" name="sexo"/></td>
                </tr>
                <tr>
                    <td>Direccion Residencial:</td>><<td><input type="text" placeholder="direccion" name="direccion"/></td>
                </tr>
                <tr>
                    <td>Lugar donde fue atendido :</td>><<td><input type="text" placeholder="clinica, hospital o centro" name="lugarAtendido"/></td>
                </tr>
                <tr>
                    <td>Motivo consulta:</td>><<td><input type="text" placeholder="motivo Consulta" name="motivoConsulta"/></td>
                </tr>
                <tr>
                    <td>Medico que atendio:</td>><<td><input type="text" placeholder="medico Atendio" name="medicoAtendio"/></td>
                </tr>
                <tr>
                    <td>Fecha:</td>><<td><input type="text" placeholder="dd/mm/aaaa" name="fecha"/></td>
                </tr>
                <tr>
                    <td><button type="submit"> Ingresar</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
