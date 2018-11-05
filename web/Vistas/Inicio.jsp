<%@page import="servicios.DtConsultaPropuesta"%>
<%@page import="java.util.List"%>
<%@page import="servicios.DtListConsultaPropuesta"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Culturarte</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/lista_propuesta.css" rel="stylesheet">
          <script src="/Culturarte_Web_SitioMovil/js/jquery.js"></script>

</head>

<body>
 <jsp:include page="/Vistas/Barra_menu.jsp" />
   <br><br>

    <div class="container">

        <div class="row">

            <div class="col-lg-12">
                <h1 style="text-align: center" class="page-header">Consulta de propuestas</h1>
            </div>
 <%
                DtListConsultaPropuesta propuestas = (DtListConsultaPropuesta) request.getAttribute("propuestas");
                List<DtConsultaPropuesta> lista = propuestas.getLista();
                for (DtConsultaPropuesta prop : lista) {%>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb contenedor">
              
                <a class="thumbnail" href="#">
                      <img class="img-responsive" src="/Culturarte_Web_SitioMovil/ServletImagenes?TituloP=<%=prop.getTitulo()%>">
                      <div class="centrado">
                          <b style="color: white"><%= prop.getTitulo()%></b>
                          </div>
                </a>
                    
            </div>
                          <% } %>
           
        </div>

        <hr>

       

    </div>
    <!-- /.container -->

    <!-- JavaScript -->
</body>

</html>