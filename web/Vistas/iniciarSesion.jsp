<%-- 
    Document   : iniciarSesion
    Created on : 11/09/2018, 11:06:29 PM
    Author     : PabloDesk
--%>

<%@page import="clases.EstadoSesion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/Culturarte_Web_SitioMovil/css/bootstrap.min.css" rel="stylesheet">
         <link href="/Culturarte_Web_SitioMovil/css/RegistrarColaboracion.css" rel="stylesheet">
       
        <title>Culturarte</title>

    </head>
    <body>
             <jsp:include page="/Vistas/Barra_menu.jsp" />
        <div class="card-body formulario" style="width: 95%">
                    <h3 class="card-title text-center">Iniciar sesion en Culturarte</h3>
                    <div class="card-text">
                        <div id="Error_login" style="display: none;" class="alert alert-danger" role="alert">
                            <span class="sr-only">Error:</span>
                            <% if (request.getAttribute("errorContrasenia") != null) {%>
                            La contraseña es incorrecta, vuelve a intentarlo.
                            <%} else {%>                  
                            No pudimos encontrar tu cuenta de Culturarte.              
                            <%}%>  
                        </div>
                        <form id="loginForm" action="${pageContext.request.contextPath}/ServletSesion" method="POST">
                            <span id="reauth-email" class="reauth-email"></span>
                            <input type="text" name="login" id="inputEmail" class="form-control" placeholder="Nickname o correo electronico" required autofocus>
                            </br>
                            <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Contraseña" required>
                            </br>
                            <label><input type="checkbox" name="Recordarme" value="">Recordarme</label>
                            <button style="background-color:#286090"  onclick="submit()" class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Iniciar Sesión</button>

                        </form>
                    </div>
                </div>
       

        <script type="text/javascript">
            <% if (request.getSession().getAttribute("estado_sesion") == EstadoSesion.LOGIN_INCORRECTO
                        || request.getSession().getAttribute("estado_sesion") == EstadoSesion.CONTRASENIA_INCORRECTA) {
                    request.getSession().setAttribute("estado_sesion", EstadoSesion.NEUTRAL);
            %>
            var var2 = document.getElementById('Error_login');
            var2.style.display = "block";
            <% }%>
        </script> 
        <div style="margin-top: 10%;">

        </div>
    </body>
</html>
