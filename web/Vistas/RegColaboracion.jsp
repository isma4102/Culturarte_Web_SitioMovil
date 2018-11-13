<%-- 
    Document   : Pagar_Colaboracion
    Created on : 17/10/2018, 03:05:44 PM
    Author     : Santiago.S
--%>

<%@page import="servicios.TipoRetorno"%>
<%@page import="servicios.DtinfoPropuesta"%>
<%@page import="servicios.DtListaPropuestasR"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Culturarte</title>
    </head>
    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
       
        <%
            DtinfoPropuesta propuestaSelec = (DtinfoPropuesta) request.getAttribute("Propuestaseleccionada");
            String Opcion = propuestaSelec.getTitulo();
        %>
        <div class="page-header header-filter" data-parallax="true" style="background-color: #337ab7;margin-top: -20px;"> </div>
        <div style="margin-left: 2%;" class="main main-raised">
            <div class="profile-content">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6 ml-auto mr-auto">
                            <div class="profile">
                                 <br><br>
                                <div class="modal-content formulario" >
                                    <div class="modal-header">
                                        <h2 align="center" class="modal-title" id="exampleModalLabel">Registrar la colaboración con la propuesta "<% out.print(Opcion);%>"</h3>
                                    </div>    
                                    <div class="modal-body">
                                        <form class="form-signin" action="ServletRegistroColaboracion" method="POST">
                                            <div class="form-group">
                                                <label required for="recipient-name" class="col-form-label">Monto:</label>
                                                <input name="Monto" type="text" class="form-control" id="recipient-name" required>
                                            </div>
                                            <select name="Tipo_Retorno" class="form-control" >
                                                <% if (propuestaSelec.getTipoRetorno().compareTo(TipoRetorno.ENTRADAS) == 0) {
                                                        out.print("<option>Entradas</option>");
                                                    } else if (propuestaSelec.getTipoRetorno().compareTo(TipoRetorno.POR_GANANCIAS) == 0) {
                                                        out.print("<option>Por ganancias</option>");
                                                    } else {
                                                        out.print("<option>Entradas</option>");
                                                        out.print("<option>Por ganancias</option>");
                                                    }
                                                %>
                                            </select>


 <div style="text-align: center">
                                    <a href="javascript:window.history.back();" class="btn btn-danger"> &laquo; Volver</a>
                                    <a href="ServletInicio" class="btn btn-primary" > &laquo; Salir a inicio</a>
                                    <button type="input" name="Registrar" class="btn btn-primary">Registrar</button>
                                </div>


                                        </form>
                                    </div>

                                </div>
                                            <br><br>
                               
                                            <br><br>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        

    </body>
</html>
