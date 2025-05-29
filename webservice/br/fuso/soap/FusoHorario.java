
package br.fuso.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de fusoHorario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="fusoHorario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fuso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fusoHorario", propOrder = {
    "cidade",
    "cnes",
    "fuso"
})
public class FusoHorario {

    protected String cidade;
    protected String cnes;
    protected String fuso;

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade cnes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnes() {
        return cnes;
    }

    /**
     * Define o valor da propriedade cnes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnes(String value) {
        this.cnes = value;
    }

    /**
     * Obtém o valor da propriedade fuso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuso() {
        return fuso;
    }

    /**
     * Define o valor da propriedade fuso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuso(String value) {
        this.fuso = value;
    }

}
