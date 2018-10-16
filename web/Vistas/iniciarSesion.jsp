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
        <script type="text/javascript" src="/CulturarteWeb/script/jquery.js"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/iniciarSesion.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>

        <title>Iniciar Sesion:: CulturarteWeb</title>

    </head>
    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
        <div class="container">
            <div class="formulario" style="margin-top: 14%;">
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="/CulturarteWeb/Imagenes/nadie.png" />
            <p id="profile-name" class="profile-name-card"></p>
             <div id="Error_login" style="display: none;" class="alert alert-danger" role="alert">
                    <span class="sr-only">Error:</span>
                    <% if (request.getAttribute("errorContrasenia")!=null)
                    {%>
                    Contraseña Incorrecta.
                    <%}
                    else{%>                  
                    Usuario Incorrecto, reintente o Registrese si aun no tiene una cuenta.                  
                    <%}%>  
            </div>
             <form id="loginForm" action="${pageContext.request.contextPath}/iniciar-sesion" method="POST">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" name="login" id="inputEmail" class="form-control" placeholder="Nickname o correo electronico" required autofocus>
                </br>
                <input type="password" name="pass" id="inputPassword" class="form-control" placeholder="Contraseña" required>
                </br>
                <button style="background-color:#286090"  onclick="submit()" class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Iniciar Sesión</button>
                </br>
                <button style="background-color:#286090" href="/CulturarteWeb/altaUsuarioServlet" class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Registrarse</button>
                
            </form><!-- /form -->
           
        </div><!-- /card-container -->
    </div><!-- /container -->
     <script type="text/javascript">
            <% if (request.getSession().getAttribute("estado_sesion") == EstadoSesion.LOGIN_INCORRECTO || 
                    request.getSession().getAttribute("estado_sesion")==EstadoSesion.CONTRASENIA_INCORRECTA) { 
                    request.getSession().setAttribute("estado_sesion", EstadoSesion.NEUTRAL);
            %>
            var var2 = document.getElementById('Error_login');
            var2.style.display = "block";
            <% }%>
        </script> 
    <div style="margin-top: 10%;">
    <jsp:include page="/Vistas/footer.jsp" />
    </div>
    </body>
</html>