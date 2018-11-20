
package com.scm.demo.customer.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updatePerson complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updatePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="person" type="{http://service.ws.demo.scm.com/}customers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePerson", propOrder = {
    "person"
})
public class UpdatePerson {

    protected Customers person;

    /**
     * 获取person属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Customers }
     *     
     */
    public Customers getPerson() {
        return person;
    }

    /**
     * 设置person属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Customers }
     *     
     */
    public void setPerson(Customers value) {
        this.person = value;
    }

}
