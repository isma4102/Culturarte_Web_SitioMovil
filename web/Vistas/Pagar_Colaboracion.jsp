<%-- 
    Document   : Pagar_Colaboracion
    Created on : 17/10/2018, 03:05:44 PM
    Author     : Santiago.S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Culturarte</title>
        <link href="/Culturarte_Web_SitioMovil/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script src="/Culturarte_Web_SitioMovil/js/bootstrap.min.js"></script>
         <script src="/Culturarte_Web_SitioMovil/js/jquery.js"></script>
               <link href="/Culturarte_Web_SitioMovil/css/RegistrarColaboracion.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="/Vistas/Barra_menu.jsp" />
        <H3 align="center"> Pago de Colaboración de la propuesta <%= request.getParameter("TituloP") %>   </H3> 
        <article class="card">
            
            <div class="card-body p-5">
                <div align="center">
                <ul class="nav bg-light nav-pills rounded nav-fill mb-3" role="tablist">

                    <li class="nav-item active">
                        <a class="nav-link" data-toggle="pill" href="#nav-tab-card">
                            <i class="fa fa-credit-card"></i> Tarjeta de Credito</a></li>
                    <li class="nav-item">
                        <a class="nav-link " data-toggle="pill" href="#nav-tab-paypal">
                            <i class="fab fa-paypal"></i>  Paypal</a></li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="pill" href="#nav-tab-bank">
                            <i class="fa fa-university"></i>  Transferencia bancaria</a></li>
                </ul>
                </div>
                <div class="tab-content">
                    <div style="width: 95%;" class="tab-pane formulario active" id="nav-tab-card">
                        <dt>Detalles de la tarjeta de credito</dt>
                        <p style="display: none" class="alert alert-success">#</p>
                       <form class="form-signin" action="ServletPagoColaboracion" method="POST"> 
                           <input type="hidden" class="form-control-plaintext" name="TituloP" value="<%=request.getParameter("TituloP")%>" readonly="readonly"/>
                            <label for="username">Tipo de tarjeta:</label>
                            <select name="Tipo" class="form-control">         
                                <option value="OCA">OCA</option>
                                <option value="Visa">Visa</option>
                                 <option value="Master">Mastercard</option>
                            </select> 
                            <div class="form-group">
                                <label for="username">Nombre completo:</label>
                                <input type="text" class="form-control" name="Nombre" placeholder="" required="">
                            </div> 
                            <div class="form-group">
                                <label for="cardNumber">Numero de tarjeta:</label>
                                <div class="input-group">
                                    <input type="text" class="form-control" name="NumeroTarjeta" placeholder="">
                                    <div class="input-group-append">
                                        <span class="input-group-text text-muted">
                                            <i class="fab fa-cc-visa"></i>   <i class="fab fa-cc-amex"></i>   
                                            <i class="fab fa-cc-mastercard"></i> 
                                        </span>
                                    </div>
                                </div>
                            </div> 
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="form-group">
                                             <label for="fechaR">Fecha de vencimiento:</label>
                                            <br>
                                            <input class="form-control" id="FechaR" name="FechaR" type="date" required/>
                                    </div>
                                </div>
                                <div class="col-sm-4">
                                    <div class="form-group">
                                        <label data-toggle="tooltip" title="" data-original-title="3 digits code on back side of the card">CVC <i class="fa fa-question-circle"></i></label>
                                        <input type="number" class="form-control" required="" name="CVC">
                                    </div> 
                                </div>
                            </div> 
                            <button name="TarjetaCredito" class="subscribe btn btn-primary btn-block" type="imput">Confirmar</button>
                        </form>
                    </div> 
                    <div style="width: 95%;" class="tab-pane formulario" id="nav-tab-paypal">
                        <dt>Detalles de la cuenta de Paypal</dt>
                        <br>
                        <label for="cardNumber">Numero de cuenta:</label>
                        <input type="text" class="form-control" name="username" placeholder="" required="">
                        <label for="cardNumber">Nombre del titular:</label>
                        <input type="text" class="form-control" name="username" placeholder="" required="">
                        <button class="subscribe btn btn-primary btn-block" type="button">  Confirmar</button>
                    </div>
                    <div style="width: 95%;" class="tab-pane formulario " id="nav-tab-bank">
                        <dt>Detalles de la cuenta del Banco</dt>
                        <br>
                        <dl class="param">
                            <label for="cardNumber">Nombre del banco:</label>
                            <input type="text" class="form-control" name="username" placeholder="" required="">
                        </dl>
                        <dl class="param">
                            <label for="cardNumber">Numero de cuenta:</label>
                            <input type="text" class="form-control" name="username" placeholder="" required="">
                        </dl>
                        <dl class="param">
                            <label for="cardNumber">Nombre del titular:</label>
                            <input type="text" class="form-control" name="username" placeholder="" required="">
                        </dl>
                        <button class="subscribe btn btn-primary btn-block" type="button"> Confirmar  </button>
                    </div> 
                </div> 
            </div> 
          
        </article> 

    </body>
</html>
