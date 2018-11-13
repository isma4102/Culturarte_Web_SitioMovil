<%@page import="servicios.DtinfoPropuesta"%>
<%@page import="servicios.DtConsultaPropuesta"%>
<%@page import="java.util.List"%>
<%@page import="servicios.DtListaPropuestasR"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8"/>


        <title>Culturarte</title>

        <!-- Bootstrap core CSS -->
        <style>
            #titulo{
                background-color: Transparent;
                background-repeat:no-repeat;
                border: none;
                cursor:pointer;
                overflow: hidden;
                outline:none;
            }
        </style>

    </head>

    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />

        <div style="width: 95%;" class="container formulario">

            <div class="row">

                <div class="col-lg-12">
                    <h4 style="margin-top: 0%;text-align: center" class="page-header">Consulta de propuestas</h4>
                </div>
                <%
                    List<DtListaPropuestasR> propuestas = (List<DtListaPropuestasR>) request.getAttribute("propuestas");
                    
                    for (DtListaPropuestasR prop : propuestas) {%>
                <div class="col-lg-3 col-md-4 col-xs-6 thumb contenedor">
                    <a class="thumbnail" href="#">
                        <img style="filter: brightness(35%); width:200px; height:141px"  class="img-responsive" src="/Culturarte_Web_SitioMovil/ServletImagenes?TituloP=<%=prop.getTitulo()%>">           
                        <div class="centrado">
                            <% out.print("<tr>");
                                out.print("<form class=\"form-signin\" action=\"ServletConsultarPropuesta\" method=\"POST\"> ");
                                out.print("<input style=\"border:none\" type=\"hidden\" class=\"form-control-plaintext\" name=\"TituloP\" value=\"" + prop.getTitulo() + "\" readonly=\"readonly\"/>");
                                out.print("<button name=\"seleccionar\" id=\"titulo\" type=\"input\" ><b style =\"color: white\">" + prop.getTitulo() + "<br> "+ prop.getEstado() +  "</b></button>");
                                // out.print("<td><button style=\"background:url('/CulturarteWeb/Imagenes/ver.png');background-position:center center;background-repeat:no-repeat;width:70px; height:25px\" type=\"input\" name=\"Ver\" class=\"btn btn-primary\"></button></td>");
                                out.print("</form>");
                                out.print("</tr>");
                            %>
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
