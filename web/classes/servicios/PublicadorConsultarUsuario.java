
package servicios;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PublicadorConsultarUsuario", targetNamespace = "http://Servicios/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublicadorConsultarUsuario {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/publicarConsultarUsuarioRequest", output = "http://Servicios/PublicadorConsultarUsuario/publicarConsultarUsuarioResponse")
    public void publicarConsultarUsuario(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param nick
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DesactivarProponente")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/DesactivarProponenteRequest", output = "http://Servicios/PublicadorConsultarUsuario/DesactivarProponenteResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Servicios/PublicadorConsultarUsuario/DesactivarProponente/Fault/Exception")
    })
    public boolean desactivarProponente(
        @WebParam(name = "nick", partName = "nick")
        String nick)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns servicios.DtListUsuario
     */
    @WebMethod(operationName = "ListarUsuarios")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ListarUsuariosRequest", output = "http://Servicios/PublicadorConsultarUsuario/ListarUsuariosResponse")
    public DtListUsuario listarUsuarios();

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListInfoPropuesta
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "ListarPropuestasDeProponenteX")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ListarPropuestasDeProponenteXRequest", output = "http://Servicios/PublicadorConsultarUsuario/ListarPropuestasDeProponenteXResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Servicios/PublicadorConsultarUsuario/ListarPropuestasDeProponenteX/Fault/Exception")
    })
    public DtListInfoPropuesta listarPropuestasDeProponenteX(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtinfoColaborador
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/getDtColaboradorRequest", output = "http://Servicios/PublicadorConsultarUsuario/getDtColaboradorResponse")
    public DtinfoColaborador getDtColaborador(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListInfoPropuesta
     */
    @WebMethod(operationName = "ListarPropuestasNoIngresadas")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ListarPropuestasNoIngresadasRequest", output = "http://Servicios/PublicadorConsultarUsuario/ListarPropuestasNoIngresadasResponse")
    public DtListInfoPropuesta listarPropuestasNoIngresadas(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListUsuario
     */
    @WebMethod(operationName = "ObtenerSeguidores")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ObtenerSeguidoresRequest", output = "http://Servicios/PublicadorConsultarUsuario/ObtenerSeguidoresResponse")
    public DtListUsuario obtenerSeguidores(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @return
     *     returns servicios.DtListUsuario
     */
    @WebMethod(operationName = "ListarUsuariosRanking")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ListarUsuariosRankingRequest", output = "http://Servicios/PublicadorConsultarUsuario/ListarUsuariosRankingResponse")
    public DtListUsuario listarUsuariosRanking();

    /**
     * 
     * @param colaborador
     * @return
     *     returns servicios.DtListColaboraciones
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/getMontoColaboracionRequest", output = "http://Servicios/PublicadorConsultarUsuario/getMontoColaboracionResponse")
    public DtListColaboraciones getMontoColaboracion(
        @WebParam(name = "colaborador", partName = "colaborador")
        String colaborador);

    /**
     * 
     * @param nick
     * @return
     *     returns byte[]
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/retornarImagenRequest", output = "http://Servicios/PublicadorConsultarUsuario/retornarImagenResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Servicios/PublicadorConsultarUsuario/retornarImagen/Fault/Exception")
    })
    public byte[] retornarImagen(
        @WebParam(name = "nick", partName = "nick")
        String nick)
        throws Exception_Exception
    ;

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListUsuario
     */
    @WebMethod(operationName = "ObtenerSeguidos")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ObtenerSeguidosRequest", output = "http://Servicios/PublicadorConsultarUsuario/ObtenerSeguidosResponse")
    public DtListUsuario obtenerSeguidos(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListInfoPropuesta
     */
    @WebMethod(operationName = "VerPropuestas")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/VerPropuestasRequest", output = "http://Servicios/PublicadorConsultarUsuario/VerPropuestasResponse")
    public DtListInfoPropuesta verPropuestas(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @param login
     * @return
     *     returns servicios.DtUsuario
     */
    @WebMethod(operationName = "ObtenerDtUsuario")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ObtenerDtUsuarioRequest", output = "http://Servicios/PublicadorConsultarUsuario/ObtenerDtUsuarioResponse")
    public DtUsuario obtenerDtUsuario(
        @WebParam(name = "login", partName = "login")
        String login);

    /**
     * 
     * @param nickname
     * @return
     *     returns servicios.DtListInfoPropuesta
     */
    @WebMethod(operationName = "ObtenerFavoritas")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ObtenerFavoritasRequest", output = "http://Servicios/PublicadorConsultarUsuario/ObtenerFavoritasResponse")
    public DtListInfoPropuesta obtenerFavoritas(
        @WebParam(name = "nickname", partName = "nickname")
        String nickname);

    /**
     * 
     * @param nick
     * @param titulo
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AgregarFavortio")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/AgregarFavortioRequest", output = "http://Servicios/PublicadorConsultarUsuario/AgregarFavortioResponse")
    public boolean agregarFavortio(
        @WebParam(name = "titulo", partName = "titulo")
        String titulo,
        @WebParam(name = "nick", partName = "nick")
        String nick);

    /**
     * 
     * @param nick2
     * @param nick1
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "SeguirUsuario")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/SeguirUsuarioRequest", output = "http://Servicios/PublicadorConsultarUsuario/SeguirUsuarioResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Servicios/PublicadorConsultarUsuario/SeguirUsuario/Fault/Exception")
    })
    public boolean seguirUsuario(
        @WebParam(name = "nick1", partName = "nick1")
        String nick1,
        @WebParam(name = "nick2", partName = "nick2")
        String nick2)
        throws Exception_Exception
    ;

    /**
     * 
     * @param login
     * @return
     *     returns servicios.DtUsuario
     */
    @WebMethod(operationName = "ObtenerDtUsuario_Correo")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/ObtenerDtUsuario_CorreoRequest", output = "http://Servicios/PublicadorConsultarUsuario/ObtenerDtUsuario_CorreoResponse")
    public DtUsuario obtenerDtUsuarioCorreo(
        @WebParam(name = "login", partName = "login")
        String login);

    /**
     * 
     * @param nick2
     * @param nick1
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DejarSeguirUsuario")
    @WebResult(partName = "return")
    @Action(input = "http://Servicios/PublicadorConsultarUsuario/DejarSeguirUsuarioRequest", output = "http://Servicios/PublicadorConsultarUsuario/DejarSeguirUsuarioResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://Servicios/PublicadorConsultarUsuario/DejarSeguirUsuario/Fault/Exception")
    })
    public boolean dejarSeguirUsuario(
        @WebParam(name = "nick1", partName = "nick1")
        String nick1,
        @WebParam(name = "nick2", partName = "nick2")
        String nick2)
        throws Exception_Exception
    ;

}
