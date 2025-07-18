
package br.cbo.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CboManagerImpService", targetNamespace = "http://cbo/", wsdlLocation = "http://10.100.36.121:8080/cbo?wsdl")
public class CboManagerImpService
    extends Service
{

    private final static URL CBOMANAGERIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CBOMANAGERIMPSERVICE_EXCEPTION;
    private final static QName CBOMANAGERIMPSERVICE_QNAME = new QName("http://cbo/", "CboManagerImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.100.36.121:8080/cbo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CBOMANAGERIMPSERVICE_WSDL_LOCATION = url;
        CBOMANAGERIMPSERVICE_EXCEPTION = e;
    }

    public CboManagerImpService() {
        super(__getWsdlLocation(), CBOMANAGERIMPSERVICE_QNAME);
    }

    public CboManagerImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CBOMANAGERIMPSERVICE_QNAME, features);
    }

    public CboManagerImpService(URL wsdlLocation) {
        super(wsdlLocation, CBOMANAGERIMPSERVICE_QNAME);
    }

    public CboManagerImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CBOMANAGERIMPSERVICE_QNAME, features);
    }

    public CboManagerImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CboManagerImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CboService
     */
    @WebEndpoint(name = "CboManagerImpPort")
    public CboService getCboManagerImpPort() {
        return super.getPort(new QName("http://cbo/", "CboManagerImpPort"), CboService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CboService
     */
    @WebEndpoint(name = "CboManagerImpPort")
    public CboService getCboManagerImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cbo/", "CboManagerImpPort"), CboService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CBOMANAGERIMPSERVICE_EXCEPTION!= null) {
            throw CBOMANAGERIMPSERVICE_EXCEPTION;
        }
        return CBOMANAGERIMPSERVICE_WSDL_LOCATION;
    }

}
