package br.udesc.servicos.entity;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-05-24T10:30:29.690-03:00
 * Generated source version: 2.7.10
 * 
 */
@WebService(targetNamespace = "http://entity.servicos.udesc.br/", name = "PedidoService")
@XmlSeeAlso({ObjectFactory.class})
public interface PedidoService {

    @Oneway
    @RequestWrapper(localName = "alterarStatusPedido", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.AlterarStatusPedido")
    @WebMethod(action = "alterarStatusPedido")
    public void alterarStatusPedido(
        @WebParam(name = "codPedido", targetNamespace = "")
        int codPedido,
        @WebParam(name = "novoStatus", targetNamespace = "")
        int novoStatus
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPedido", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.GetPedido")
    @WebMethod(action = "getPedido")
    @ResponseWrapper(localName = "getPedidoResponse", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.GetPedidoResponse")
    public br.udesc.servicos.entity.Pedido getPedido(
        @WebParam(name = "codPedido", targetNamespace = "")
        int codPedido
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "createPedido", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.CreatePedido")
    @WebMethod(action = "createPedido")
    @ResponseWrapper(localName = "createPedidoResponse", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.CreatePedidoResponse")
    public boolean createPedido(
        @WebParam(name = "pedido", targetNamespace = "")
        br.udesc.servicos.entity.Pedido pedido
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPedidosPorStatus", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.GetPedidosPorStatus")
    @WebMethod(action = "getPedidosPorStatus")
    @ResponseWrapper(localName = "getPedidosPorStatusResponse", targetNamespace = "http://entity.servicos.udesc.br/", className = "br.udesc.servicos.entity.GetPedidosPorStatusResponse")
    public java.util.List<br.udesc.servicos.entity.Pedido> getPedidosPorStatus(
        @WebParam(name = "codStatus", targetNamespace = "")
        int codStatus
    );
}
