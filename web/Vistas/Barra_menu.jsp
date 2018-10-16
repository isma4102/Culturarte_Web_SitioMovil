<%@page import="logica.Clases.DtUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>Cultuarte</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
        <meta http-equiv="X-UA-Compatible" content="IE=edge" >
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" >
        <script src="js/jquery.js"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <script src="js/bootstrap.min.js"></script>
        <style>
            .dev-page{visibility: hidden; }            
        </style>

    </head>
    <body>


        <nav style="background-color: black;" class="navbar navbar-default" role="navigation">
            <!-- El logotipo y el icono que despliega el menú se agrupan
                 para mostrarlos mejor en los dispositivos móviles -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Desplegar navegación</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a style="color:#878482" class="navbar-brand" href="#">Bienvenido Kairoh</a>
            </div>

            <!-- Agrupar los enlaces de navegación, los formularios y cualquier
                 otro elemento que se pueda ocultar al minimizar la barra -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li><a style="color:#878482" href="#">Consultar Propuestas</a></li>
                    <li><a style="color:#878482" href="#">Registrar Colaboración</a></li>
                    <li><a style="color:#878482" href="#">Pagar Colaboración</a></li>
                    <li><a style="color:#878482" href="#">Cerrar Sesión</a></li>
                </ul>

               

               
            </div>
        </nav>


    </body>
</html>
