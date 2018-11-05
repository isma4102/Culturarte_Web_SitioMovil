<%@page import="servicios.DtUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>Cultuarte</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
        <meta http-equiv="X-UA-Compatible" content="IE=edge" >
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" >
        <link href="/Culturarte_Web_SitioMovil/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script src="/Culturarte_Web_SitioMovil/js/bootstrap.min.js"></script>

        <style>
            .dev-page{visibility: hidden; }            
        </style>
    </head>
    <body>
        <nav style="background-color: black" class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <% if (request.getSession().getAttribute("usuario_logueado") == null) { %>
            <a style="color:#878482" class="navbar-brand" href="#">Bienvenido</a>
            <% } else {%>
            <a style="color:#878482" class="navbar-brand" href="/Culturarte_Web_SitioMovil/ServletInicio">Bienvenido <%=((DtUsuario) request.getSession().getAttribute("usuario_logueado")).getNombre()%></a>
            <% }%>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="nav-item py-md-2"><a href="#" class="nav-link">Registrar Colaboración</a></li>
                    <li class="nav-item py-md-2"><a href="/Culturarte_Web_SitioMovil/Vistas/Pagar_Colaboracion.jsp" class="nav-link">Pagar Colaboración</a></li>
                    <li class="nav-item py-md-2"><a href="/Culturarte_Web_SitioMovil/CerrarSesion" class="nav-link">Cerrar Sesión</a></li>
                    </ul>
                   
                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </nav>

    </body>
</html>
