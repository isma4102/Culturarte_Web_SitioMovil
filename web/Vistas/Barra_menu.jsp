<%@page import="servicios.DtUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>Cultuarte</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
        <meta http-equiv="X-UA-Compatible" content="IE=edge" >
        <script src="/Culturarte_Web_SitioMovil/js/jquery.js"></script> 
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" >
        <link href="/Culturarte_Web_SitioMovil/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap.css" rel="stylesheet">
        <script src="js/bootstrap.js"></script>
        <link href="css/lista_propuesta.css" rel="stylesheet">
        <link href="/Culturarte_Web_SitioMovil/css/RegistrarColaboracion.css" rel="stylesheet">

        <style>
            .dev-page{visibility: hidden; }            
        </style>
    </head>
    <body style="margin: 0;margin-bottom: 40px;">
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
                    <a style="color:#878482" class="navbar-brand" href="/Culturarte_Web_SitioMovil/ServletInicio">Bienvenido</a>
                    <% } else {%>
                    <a style="color:#878482" class="navbar-brand" href="/Culturarte_Web_SitioMovil/ServletInicio">Bienvenido <%=((DtUsuario) request.getSession().getAttribute("usuario_logueado")).getNombre()%></a>
                    <% }%>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="nav-item py-md-2"><a href="/Culturarte_Web_SitioMovil/ServletRegistroColaboracion" class="nav-link">Registrar Colaboración</a></li>
                    
                    <% if (request.getSession().getAttribute("usuario_logueado") != null) { %>
                    <li class="nav-item py-md-2"><a href="/Culturarte_Web_SitioMovil/CerrarSesion" class="nav-link">Cerrar Sesión</a></li>
                    <% }%>
                    
                    </ul>

                </div><!--/.nav-collapse -->
            </div><!--/.container-fluid -->
        </nav>

    </body>
</html>
