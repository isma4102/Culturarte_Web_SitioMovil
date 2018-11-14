<%-- 
    Document   : ConsultarPropuesta
    Created on : 07-nov-2018, 14:17:05
    Author     : Lucas
--%>

<%@page import="java.util.List"%>
<%@page import="servicios.DtConsultaPropuesta2"%>
<%@page import="servicios.DtConsultaPropuesta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #padre {
                display: flex;
                justify-content: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
        <%
            List<DtConsultaPropuesta2> lista = (List<DtConsultaPropuesta2>) request.getAttribute("listaC");
            DtConsultaPropuesta dtInf = (DtConsultaPropuesta) request.getAttribute("propuesta");
        %>
        <%
            String colaboradores = " 0 colaboraciones";
            for (int i = 0; i < lista.size(); i++) {
                if (i == 1) {
                    colaboradores = lista.get(i).getNickColab();
                } else {
                    colaboradores = colaboradores + "-" + lista.get(i).getNickColab();
                }
            }
        %>
        <div style="width: 50%" class="container">
            <div class="row">
                <div style="width: 100%;height: 70%">
                    <img style="width: 100%;height: 100%;" class="img img-thumbnail img-responsive" src="/Culturarte_Web_SitioMovil/ServletImagenes?TituloP=<%=dtInf.getTitulo()%>"/><br>
                </div>
                <div id="padre"><a style="vertical-align: central"><%=dtInf.getTitulo()%></a></div>
                 <form class="form-signin" action="ServletRegistroColaboracion" method="POST"> 
                    <input type="hidden" class="form-control-plaintext" name="Estado" value="<%= dtInf.getEstadoActual().toString() %>" readonly="readonly"/>
                     <input type="hidden" class="form-control-plaintext" name="TituloP" value="<%= dtInf.getTitulo() %>" readonly="readonly"/>
                    <button name="seleccionar" class="btn btn-block btn-xs btn-primary">Colaborar</button>
                </form>

            </div>
        </div><br>
        <div class="row">
            <ul class="list-group">
                <li class="list-group-item">Fecha: <%=dtInf.getFechaR()%></li>
                <li class="list-group-item">Lugar: <%=dtInf.getLugar()%></li>
                <li class="list-group-item">Precio de entrada: <%=dtInf.getMontoE()%></li>
                <li class="list-group-item">Monto a recaudar: <%=dtInf.getMontoTot()%></li>
                <li class="list-group-item">Tipo de retorno: <%=dtInf.getTipoRet()%></li>
                <li class="list-group-item">Estado: <%=dtInf.getEstadoActual()%></li>
                <li class="list-group-item">Colaboradores:<%= colaboradores%> </li>
                <li class="list-group-item">Monto recaudado: <%=dtInf.getMontoActual()%></li>

            </ul>
        </div>


    </body>
</html>
