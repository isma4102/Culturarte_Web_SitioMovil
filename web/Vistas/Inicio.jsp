<%-- 
    Document   : Inicio
    Created on : 18/09/2018, 01:12:17 AM
    Author     : Martin
--%>

<%@page import="servicios.DtConsultaPropuesta"%>
<%@page import="servicios.DtListConsultaPropuesta"%>
<%@page import="java.util.Iterator"%>
<%@page import="servicios.DtNickTitProp"%>
<%@page import="java.util.List"%>
<%@page import="servicios.DtListNickTitProp"%>
<%@page import="clases.EstadoSesion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <link rel="icon" type="image/png" href="Imagenes/icono.png"/>
        <link type="text/css" href="../css/bootstrap.css"/>
        <link type="text/css" href="../css/galeriaProp.css"/>
        <title>Culturarte</title>
        <script src="/Culturarte_Web_SitioMovil/js/jquery.js"></script>


    </head>
    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
        <div class="row">
            <%
                DtListConsultaPropuesta propuestas = (DtListConsultaPropuesta) request.getAttribute("propuestas");
                List<DtConsultaPropuesta> lista = propuestas.getLista();
                for (DtConsultaPropuesta prop : lista) {%>
            <div style="display: inline-block; width: 40%; height: 40%" class="column">
                <div style="display: inline-block; width: auto; height: 100%">
                <img class="img img-thumbnail" style="max-width: 100%; height: 0%" src="/Culturarte_Web_SitioMovil/ServletImagenes?TituloP=<%=prop.getTitulo()%>"> 
                </div>
            </div>
            <%}%>
        </div>
    </body>
</html>
