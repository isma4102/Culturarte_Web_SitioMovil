/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicios.DtListInfoPropuesta;
import servicios.DtUsuario;
import servicios.DtinfoPropuesta;
import servicios.Exception_Exception;
import servicios.PublicadorConsultarUsuario;
import servicios.PublicadorConsultarUsuarioService;
import servicios.PublicadorRegistrarColaboracion;
import servicios.PublicadorRegistrarColaboracionService;

/**
 *
 * @author Santiago.S
 */
@WebServlet(name = "ServletPagoColaboracion", urlPatterns = {"/ServletPagoColaboracion"})
public class ServletPagoColaboracion extends HttpServlet {
 private PublicadorConsultarUsuario port;
 private PublicadorRegistrarColaboracion port1;
   configuracion conf = new configuracion();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context;
        context = request.getServletContext();
        String ruta = context.getResource("").getPath();

        URL url = new URL("http://" + conf.obtenerServer("servidor", ruta) + conf.leerProp("sConsultaUsuario", ruta));
        PublicadorConsultarUsuarioService webService = new PublicadorConsultarUsuarioService(url);
        this.port = webService.getPublicadorConsultarUsuarioPort();
        String nombre = ((DtUsuario) request.getSession().getAttribute("usuario_logueado")).getNickname();
        DtListInfoPropuesta propuestas = (DtListInfoPropuesta) this.port.verPropuestas(nombre);
        List<DtinfoPropuesta> lista = propuestas.getLista();
        request.setAttribute("propuestas", lista);
        request.getRequestDispatcher("Vistas/Listar_colaboraciones.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
  ServletContext context;
        context = request.getServletContext();
        String ruta = context.getResource("").getPath();
        URL url = new URL("http://" + conf.obtenerServer("servidor", ruta) + conf.leerProp("sRegistrarColaboracion", ruta));
        PublicadorRegistrarColaboracionService webService = new PublicadorRegistrarColaboracionService(url);
        this.port1 = webService.getPublicadorRegistrarColaboracionPort();

        if (request.getParameter("TituloP1") != null) {
            request.getSession().setAttribute("TituloP", request.getAttribute("TituloP"));
            request.getRequestDispatcher("/Vistas/Pagar_Colaboracion.jsp").forward(request, response);
        } else if (request.getParameter("TarjetaCredito") != null) {
            String nick = ((DtUsuario) request.getSession().getAttribute("usuario_logueado")).getNickname();
            String propuesta = request.getParameter("TituloP");
            String TipoTarjeta = request.getParameter("Tipo");
            String Nombre = request.getParameter("Nombre");
            String NumeroTarjeta = request.getParameter("NumeroTarjeta");
            String fechaV = request.getParameter("FechaR");
            String fecha = fechaV.toString();
            Integer CVC = Integer.parseInt(request.getParameter("CVC"));
            try {
                port1.cargarPagosTarjeta(nick, propuesta, TipoTarjeta, NumeroTarjeta, fecha, CVC, Nombre);
            } catch (Exception_Exception ex) {
                Logger.getLogger(ServletPagoColaboracion.class.getName()).log(Level.SEVERE, null, ex);
            }
              request.getRequestDispatcher("ServletInicio").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
