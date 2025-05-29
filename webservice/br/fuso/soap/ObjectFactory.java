
package br.fuso.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.fuso.soap package. 
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

    private final static QName _AddFuso_QNAME = new QName("http://soap/", "addFuso");
    private final static QName _AddFusoResponse_QNAME = new QName("http://soap/", "addFusoResponse");
    private final static QName _GetAll_QNAME = new QName("http://soap/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://soap/", "getAllResponse");
    private final static QName _GetByCNES_QNAME = new QName("http://soap/", "getByCNES");
    private final static QName _GetByCNESResponse_QNAME = new QName("http://soap/", "getByCNESResponse");
    private final static QName _RemoveFusoByCNES_QNAME = new QName("http://soap/", "removeFusoByCNES");
    private final static QName _RemoveFusoByCNESResponse_QNAME = new QName("http://soap/", "removeFusoByCNESResponse");
    private final static QName _UpdateFuso_QNAME = new QName("http://soap/", "updateFuso");
    private final static QName _UpdateFusoResponse_QNAME = new QName("http://soap/", "updateFusoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.fuso.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddFuso }
     * 
     */
    public AddFuso createAddFuso() {
        return new AddFuso();
    }

    /**
     * Create an instance of {@link AddFusoResponse }
     * 
     */
    public AddFusoResponse createAddFusoResponse() {
        return new AddFusoResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetByCNES }
     * 
     */
    public GetByCNES createGetByCNES() {
        return new GetByCNES();
    }

    /**
     * Create an instance of {@link GetByCNESResponse }
     * 
     */
    public GetByCNESResponse createGetByCNESResponse() {
        return new GetByCNESResponse();
    }

    /**
     * Create an instance of {@link RemoveFusoByCNES }
     * 
     */
    public RemoveFusoByCNES createRemoveFusoByCNES() {
        return new RemoveFusoByCNES();
    }

    /**
     * Create an instance of {@link RemoveFusoByCNESResponse }
     * 
     */
    public RemoveFusoByCNESResponse createRemoveFusoByCNESResponse() {
        return new RemoveFusoByCNESResponse();
    }

    /**
     * Create an instance of {@link UpdateFuso }
     * 
     */
    public UpdateFuso createUpdateFuso() {
        return new UpdateFuso();
    }

    /**
     * Create an instance of {@link UpdateFusoResponse }
     * 
     */
    public UpdateFusoResponse createUpdateFusoResponse() {
        return new UpdateFusoResponse();
    }

    /**
     * Create an instance of {@link FusoHorario }
     * 
     */
    public FusoHorario createFusoHorario() {
        return new FusoHorario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFuso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFuso }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addFuso")
    public JAXBElement<AddFuso> createAddFuso(AddFuso value) {
        return new JAXBElement<AddFuso>(_AddFuso_QNAME, AddFuso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFusoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFusoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "addFusoResponse")
    public JAXBElement<AddFusoResponse> createAddFusoResponse(AddFusoResponse value) {
        return new JAXBElement<AddFusoResponse>(_AddFusoResponse_QNAME, AddFusoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCNES }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByCNES }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getByCNES")
    public JAXBElement<GetByCNES> createGetByCNES(GetByCNES value) {
        return new JAXBElement<GetByCNES>(_GetByCNES_QNAME, GetByCNES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByCNESResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetByCNESResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getByCNESResponse")
    public JAXBElement<GetByCNESResponse> createGetByCNESResponse(GetByCNESResponse value) {
        return new JAXBElement<GetByCNESResponse>(_GetByCNESResponse_QNAME, GetByCNESResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFusoByCNES }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFusoByCNES }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "removeFusoByCNES")
    public JAXBElement<RemoveFusoByCNES> createRemoveFusoByCNES(RemoveFusoByCNES value) {
        return new JAXBElement<RemoveFusoByCNES>(_RemoveFusoByCNES_QNAME, RemoveFusoByCNES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFusoByCNESResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFusoByCNESResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "removeFusoByCNESResponse")
    public JAXBElement<RemoveFusoByCNESResponse> createRemoveFusoByCNESResponse(RemoveFusoByCNESResponse value) {
        return new JAXBElement<RemoveFusoByCNESResponse>(_RemoveFusoByCNESResponse_QNAME, RemoveFusoByCNESResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFuso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFuso }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateFuso")
    public JAXBElement<UpdateFuso> createUpdateFuso(UpdateFuso value) {
        return new JAXBElement<UpdateFuso>(_UpdateFuso_QNAME, UpdateFuso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFusoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateFusoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateFusoResponse")
    public JAXBElement<UpdateFusoResponse> createUpdateFusoResponse(UpdateFusoResponse value) {
        return new JAXBElement<UpdateFusoResponse>(_UpdateFusoResponse_QNAME, UpdateFusoResponse.class, null, value);
    }

}
