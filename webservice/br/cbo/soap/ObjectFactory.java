
package br.cbo.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.cbo.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCbo_QNAME = new QName("http://cbo/", "getCbo");
    private final static QName _GetCboResponse_QNAME = new QName("http://cbo/", "getCboResponse");
    private final static QName _GetListCbo_QNAME = new QName("http://cbo/", "getListCbo");
    private final static QName _GetListCboResponse_QNAME = new QName("http://cbo/", "getListCboResponse");
    private final static QName _RemoveCbo_QNAME = new QName("http://cbo/", "removeCbo");
    private final static QName _RemoveCboResponse_QNAME = new QName("http://cbo/", "removeCboResponse");
    private final static QName _SetCbo_QNAME = new QName("http://cbo/", "setCbo");
    private final static QName _SetCboResponse_QNAME = new QName("http://cbo/", "setCboResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.cbo.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCbo }
     * 
     */
    public GetCbo createGetCbo() {
        return new GetCbo();
    }

    /**
     * Create an instance of {@link GetCboResponse }
     * 
     */
    public GetCboResponse createGetCboResponse() {
        return new GetCboResponse();
    }

    /**
     * Create an instance of {@link GetListCbo }
     * 
     */
    public GetListCbo createGetListCbo() {
        return new GetListCbo();
    }

    /**
     * Create an instance of {@link GetListCboResponse }
     * 
     */
    public GetListCboResponse createGetListCboResponse() {
        return new GetListCboResponse();
    }

    /**
     * Create an instance of {@link RemoveCbo }
     * 
     */
    public RemoveCbo createRemoveCbo() {
        return new RemoveCbo();
    }

    /**
     * Create an instance of {@link RemoveCboResponse }
     * 
     */
    public RemoveCboResponse createRemoveCboResponse() {
        return new RemoveCboResponse();
    }

    /**
     * Create an instance of {@link SetCbo }
     * 
     */
    public SetCbo createSetCbo() {
        return new SetCbo();
    }

    /**
     * Create an instance of {@link SetCboResponse }
     * 
     */
    public SetCboResponse createSetCboResponse() {
        return new SetCboResponse();
    }

    /**
     * Create an instance of {@link Cbo }
     * 
     */
    public Cbo createCbo() {
        return new Cbo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCbo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCbo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "getCbo")
    public JAXBElement<GetCbo> createGetCbo(GetCbo value) {
        return new JAXBElement<GetCbo>(_GetCbo_QNAME, GetCbo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "getCboResponse")
    public JAXBElement<GetCboResponse> createGetCboResponse(GetCboResponse value) {
        return new JAXBElement<GetCboResponse>(_GetCboResponse_QNAME, GetCboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCbo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListCbo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "getListCbo")
    public JAXBElement<GetListCbo> createGetListCbo(GetListCbo value) {
        return new JAXBElement<GetListCbo>(_GetListCbo_QNAME, GetListCbo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetListCboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "getListCboResponse")
    public JAXBElement<GetListCboResponse> createGetListCboResponse(GetListCboResponse value) {
        return new JAXBElement<GetListCboResponse>(_GetListCboResponse_QNAME, GetListCboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCbo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCbo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "removeCbo")
    public JAXBElement<RemoveCbo> createRemoveCbo(RemoveCbo value) {
        return new JAXBElement<RemoveCbo>(_RemoveCbo_QNAME, RemoveCbo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "removeCboResponse")
    public JAXBElement<RemoveCboResponse> createRemoveCboResponse(RemoveCboResponse value) {
        return new JAXBElement<RemoveCboResponse>(_RemoveCboResponse_QNAME, RemoveCboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCbo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCbo }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "setCbo")
    public JAXBElement<SetCbo> createSetCbo(SetCbo value) {
        return new JAXBElement<SetCbo>(_SetCbo_QNAME, SetCbo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCboResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetCboResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cbo/", name = "setCboResponse")
    public JAXBElement<SetCboResponse> createSetCboResponse(SetCboResponse value) {
        return new JAXBElement<SetCboResponse>(_SetCboResponse_QNAME, SetCboResponse.class, null, value);
    }

}
