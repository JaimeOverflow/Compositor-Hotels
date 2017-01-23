
package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InfoRooms", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InfoRooms {


    /**
     * 
     * @param entryDate
     * @param departureDate
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInfoRooms", targetNamespace = "http://webservices/", className = "webservices.GetInfoRooms")
    @ResponseWrapper(localName = "getInfoRoomsResponse", targetNamespace = "http://webservices/", className = "webservices.GetInfoRoomsResponse")
    @Action(input = "http://webservices/InfoRooms/getInfoRoomsRequest", output = "http://webservices/InfoRooms/getInfoRoomsResponse")
    public String getInfoRooms(
        @WebParam(name = "entryDate", targetNamespace = "")
        String entryDate,
        @WebParam(name = "departureDate", targetNamespace = "")
        String departureDate);

}