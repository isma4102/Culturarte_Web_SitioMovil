package ControladorServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import clases.EstadoSesion;
import java.io.IOException;
import java.net.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import servicios.DtUsuario;
import servicios.PublicadorConsultarUsuario;
import servicios.PublicadorConsultarUsuarioService;

/**
 *
 * @author PabloDesk
 */
@WebServlet(name = "ServletSesion", urlPatterns = {"/ServletSesion"})
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private PublicadorConsultarUsuario port;
    configuracion conf = new configuracion();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @return
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void init() throws ServletException {
    }

    public static DtUsuario getUsuarioSesion(HttpServletRequest request) {
        return (DtUsuario) request.getSession().getAttribute("usuario_logueado");

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DtUsuario usuLogeado = (DtUsuario) request.getSession().getAttribute("usuario_logueado");
        if (usuLogeado == null) {
            request.getSession().setAttribute("estado_sesion", null);
            response.setContentType("text/html;charset=UTF-8");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Vistas/iniciarSesion.jsp");
            dispatcher.forward(request, response);
        } else {
            request.setAttribute("mensaje", "Ya existe una sesion en el sistema");
            request.getRequestDispatcher("/Vistas/Mensaje_Recibido.jsp").forward(request, response);
        }

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
        HttpSession objSesion = request.getSession();

        ServletContext context;
        context = request.getServletContext();
        String ruta = context.getResource("").getPath();
        URL url1 = new URL("http://" + conf.obtenerServer("servidor", ruta) + conf.leerProp("sConsultaUsuario", ruta));
        PublicadorConsultarUsuarioService webService = new PublicadorConsultarUsuarioService(url1);
        this.port = webService.getPublicadorConsultarUsuarioPort();

        String login = request.getParameter("login");
        String password = request.getParameter("pass");
        EstadoSesion nuevoEstado = null;
        codificador a = new codificador();
        servicios.DtUsuario usrCorreo = null;
        servicios.DtUsuario usrNick = null;
        boolean recordarme = request.getParameter("Recordarme") != null;
        try {
            usrNick = this.port.obtenerDtUsuario(login);
        } catch (Exception error) {
            try {
                usrCorreo = this.port.obtenerDtUsuarioCorreo(login);
            } catch (Exception e) {
                nuevoEstado = EstadoSesion.LOGIN_INCORRECTO;
                objSesion.setAttribute("estado_sesion", nuevoEstado);
                request.getRequestDispatcher("Vistas/iniciarSesion.jsp").forward(request, response);
            }
            if (usrCorreo != null && !usrCorreo.isEsproponente()) {
                String hash = a.sha1(password);
                if (usrCorreo.getPassword().compareTo(hash) != 0) {
                    request.setAttribute("errorContrasenia", "Contraseña Incorrecta.");
                    nuevoEstado = EstadoSesion.CONTRASENIA_INCORRECTA;
                    objSesion.setAttribute("estado_sesion", nuevoEstado);
                    request.getRequestDispatcher("Vistas/iniciarSesion.jsp").forward(request, response);
                } else {
                    if(usrCorreo.isEsproponente()==true){
                nuevoEstado = EstadoSesion.LOGIN_INCORRECTO;
                objSesion.setAttribute("estado_sesion", nuevoEstado);
                request.getRequestDispatcher("Vistas/iniciarSesion.jsp").forward(request, response);
                        }
                        
                    nuevoEstado = EstadoSesion.LOGIN_CORRECTO;
                    request.getSession().setAttribute("usuario_logueado", usrCorreo);// setea el usuario logueado
                    if (recordarme) {
                        Cookie cookieSesion = new Cookie("cookieSesion", usrCorreo.getNickname());
                        cookieSesion.setMaxAge(60 * 60 * 24);
                        cookieSesion.setPath("/");
                        response.addCookie(cookieSesion);
                    }
                
                }

            }
            objSesion.setAttribute("estado_sesion", nuevoEstado);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
            dispatcher.forward(request, response);
        }

        if (usrNick != null ) {
            String hash = a.sha1(password);
            if (usrNick.getPassword().compareTo(hash) != 0) {
                request.setAttribute("errorContrasenia", "Contraseña Incorrecta.");
                nuevoEstado = EstadoSesion.CONTRASENIA_INCORRECTA;
                objSesion.setAttribute("estado_sesion", nuevoEstado);
                request.getRequestDispatcher("Vistas/iniciarSesion.jsp").forward(request, response);
            } else {
                 if(usrNick.isEsproponente()==true){
                     
                nuevoEstado = EstadoSesion.LOGIN_INCORRECTO;
                objSesion.setAttribute("estado_sesion", nuevoEstado);
                request.getRequestDispatcher("Vistas/iniciarSesion.jsp").forward(request, response);
                     
                   }  
                     
                nuevoEstado = EstadoSesion.LOGIN_CORRECTO;
                request.getSession().setAttribute("usuario_logueado", usrNick);// setea el usuario logueado
                objSesion.setAttribute("estado_sesion", nuevoEstado);
                if (recordarme) {
                    Cookie cookieSesion = new Cookie("cookieSesion", usrNick.getNickname());
                    cookieSesion.setMaxAge(60 * 60 * 24);
                    cookieSesion.setPath("/");
                    response.addCookie(cookieSesion);
                }
                RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
                dispatcher.forward(request, response);
            }
          
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
