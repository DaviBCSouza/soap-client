
package br.cbo.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cbo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cbo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCbo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cbo", propOrder = {
    "codCbo",
    "profissao"
})
public class Cbo {

    protected String codCbo;
    protected String profissao;

    /**
     * Obtém o valor da propriedade codCbo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCbo() {
        return codCbo;
    }

    /**
     * Define o valor da propriedade codCbo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCbo(String value) {
        this.codCbo = value;
    }

    /**
     * Obtém o valor da propriedade profissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Define o valor da propriedade profissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfissao(String value) {
        this.profissao = value;
    }

}
