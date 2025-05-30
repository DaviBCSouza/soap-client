
package br.cidade.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.cidade.soap package. 
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

    private final static QName _DeleteCidade_QNAME = new QName("http://soap/", "deleteCidade");
    private final static QName _DeleteCidadeResponse_QNAME = new QName("http://soap/", "deleteCidadeResponse");
    private final static QName _GetCidade_QNAME = new QName("http://soap/", "getCidade");
    private final static QName _GetCidadeResponse_QNAME = new QName("http://soap/", "getCidadeResponse");
    private final static QName _GetCidades_QNAME = new QName("http://soap/", "getCidades");
    private final static QName _GetCidadesResponse_QNAME = new QName("http://soap/", "getCidadesResponse");
    private final static QName _InsertCidade_QNAME = new QName("http://soap/", "insertCidade");
    private final static QName _InsertCidadeResponse_QNAME = new QName("http://soap/", "insertCidadeResponse");
    private final static QName _UpdateCidade_QNAME = new QName("http://soap/", "updateCidade");
    private final static QName _UpdateCidadeResponse_QNAME = new QName("http://soap/", "updateCidadeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.cidade.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteCidade }
     * 
     */
    public DeleteCidade createDeleteCidade() {
        return new DeleteCidade();
    }

    /**
     * Create an instance of {@link DeleteCidadeResponse }
     * 
     */
    public DeleteCidadeResponse createDeleteCidadeResponse() {
        return new DeleteCidadeResponse();
    }

    /**
     * Create an instance of {@link GetCidade }
     * 
     */
    public GetCidade createGetCidade() {
        return new GetCidade();
    }

    /**
     * Create an instance of {@link GetCidadeResponse }
     * 
     */
    public GetCidadeResponse createGetCidadeResponse() {
        return new GetCidadeResponse();
    }

    /**
     * Create an instance of {@link GetCidades }
     * 
     */
    public GetCidades createGetCidades() {
        return new GetCidades();
    }

    /**
     * Create an instance of {@link GetCidadesResponse }
     * 
     */
    public GetCidadesResponse createGetCidadesResponse() {
        return new GetCidadesResponse();
    }

    /**
     * Create an instance of {@link InsertCidade }
     * 
     */
    public InsertCidade createInsertCidade() {
        return new InsertCidade();
    }

    /**
     * Create an instance of {@link InsertCidadeResponse }
     * 
     */
    public InsertCidadeResponse createInsertCidadeResponse() {
        return new InsertCidadeResponse();
    }

    /**
     * Create an instance of {@link UpdateCidade }
     * 
     */
    public UpdateCidade createUpdateCidade() {
        return new UpdateCidade();
    }

    /**
     * Create an instance of {@link UpdateCidadeResponse }
     * 
     */
    public UpdateCidadeResponse createUpdateCidadeResponse() {
        return new UpdateCidadeResponse();
    }

    /**
     * Create an instance of {@link Cidade }
     * 
     */
    public Cidade createCidade() {
        return new Cidade();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCidade }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCidade }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "deleteCidade")
    public JAXBElement<DeleteCidade> createDeleteCidade(DeleteCidade value) {
        return new JAXBElement<DeleteCidade>(_DeleteCidade_QNAME, DeleteCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCidadeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteCidadeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "deleteCidadeResponse")
    public JAXBElement<DeleteCidadeResponse> createDeleteCidadeResponse(DeleteCidadeResponse value) {
        return new JAXBElement<DeleteCidadeResponse>(_DeleteCidadeResponse_QNAME, DeleteCidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidade }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCidade }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCidade")
    public JAXBElement<GetCidade> createGetCidade(GetCidade value) {
        return new JAXBElement<GetCidade>(_GetCidade_QNAME, GetCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidadeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCidadeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCidadeResponse")
    public JAXBElement<GetCidadeResponse> createGetCidadeResponse(GetCidadeResponse value) {
        return new JAXBElement<GetCidadeResponse>(_GetCidadeResponse_QNAME, GetCidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidades }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCidades }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCidades")
    public JAXBElement<GetCidades> createGetCidades(GetCidades value) {
        return new JAXBElement<GetCidades>(_GetCidades_QNAME, GetCidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidadesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCidadesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "getCidadesResponse")
    public JAXBElement<GetCidadesResponse> createGetCidadesResponse(GetCidadesResponse value) {
        return new JAXBElement<GetCidadesResponse>(_GetCidadesResponse_QNAME, GetCidadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCidade }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertCidade }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "insertCidade")
    public JAXBElement<InsertCidade> createInsertCidade(InsertCidade value) {
        return new JAXBElement<InsertCidade>(_InsertCidade_QNAME, InsertCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCidadeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InsertCidadeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "insertCidadeResponse")
    public JAXBElement<InsertCidadeResponse> createInsertCidadeResponse(InsertCidadeResponse value) {
        return new JAXBElement<InsertCidadeResponse>(_InsertCidadeResponse_QNAME, InsertCidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCidade }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCidade }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateCidade")
    public JAXBElement<UpdateCidade> createUpdateCidade(UpdateCidade value) {
        return new JAXBElement<UpdateCidade>(_UpdateCidade_QNAME, UpdateCidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCidadeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateCidadeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap/", name = "updateCidadeResponse")
    public JAXBElement<UpdateCidadeResponse> createUpdateCidadeResponse(UpdateCidadeResponse value) {
        return new JAXBElement<UpdateCidadeResponse>(_UpdateCidadeResponse_QNAME, UpdateCidadeResponse.class, null, value);
    }

}
