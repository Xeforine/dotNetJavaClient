
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.servicelibrary.CustomerDTO;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.servicelibrary.ObjectFactory.class,
    org.tempuri.ObjectFactory.class
})
public interface ICustomerService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Register", action = "http://tempuri.org/ICustomerService/Register")
    @WebResult(name = "RegisterResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Register", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Register")
    @ResponseWrapper(localName = "RegisterResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegisterResponse")
    public String register(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns org.datacontract.schemas._2004._07.servicelibrary.CustomerDTO
     * @throws ICustomerServiceAuthenticateErrorMessageFaultFaultMessage
     */
    @WebMethod(operationName = "Authenticate", action = "http://tempuri.org/ICustomerService/Authenticate")
    @WebResult(name = "AuthenticateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Authenticate", targetNamespace = "http://tempuri.org/", className = "org.tempuri.Authenticate")
    @ResponseWrapper(localName = "AuthenticateResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AuthenticateResponse")
    public CustomerDTO authenticate(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password)
        throws ICustomerServiceAuthenticateErrorMessageFaultFaultMessage
    ;

}
