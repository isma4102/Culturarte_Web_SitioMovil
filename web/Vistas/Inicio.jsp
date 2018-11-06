<%@page import="servicios.DtConsultaPropuesta"%>
<%@page import="java.util.List"%>
<%@page import="servicios.DtListConsultaPropuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>


        <title>Culturarte</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/lista_propuesta.css" rel="stylesheet">
        <link href="css/RegistrarColaboracion.css" rel="stylesheet">
        <script src="/Culturarte_Web_SitioMovil/js/jquery.js"></script>

    </head>

    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
        
        <div style="width: 95%;" class="container formulario">

            <div class="row">

                <div class="col-lg-12">
                    <h4 style="margin-top: 0%;text-align: center" class="page-header">Consulta de propuestas</h4>
                </div>
                <%
                    DtListConsultaPropuesta propuestas = (DtListConsultaPropuesta) request.getAttribute("propuestas");
                    List<DtConsultaPropuesta> lista = propuestas.getLista();
     for (DtConsultaPropuesta prop : lista) {%>
                <div class="col-lg-3 col-md-4 col-xs-6 thumb contenedor">
                    <a class="thumbnail" href="#">
                        <img style="filter: brightness(35%); width:200px; height:141px" class="img-responsive" src="/Culturarte_Web_SitioMovil/ServletImagenes?TituloP=<%=prop.getTitulo()%>">           
                        <div class="centrado">
                            <b style="color: white"><%= prop.getTitulo()%></b>
                        </div>
                    </a>

                </div>
                <% }%>

            </div>

            <hr>



        </div>
        <!-- /.container -->

        <!-- JavaScript -->
    </body>

</html>