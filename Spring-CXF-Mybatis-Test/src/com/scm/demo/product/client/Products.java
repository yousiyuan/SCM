
package com.scm.demo.product.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


/**
 * <p>products complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="products"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categoryid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="discontinued" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="productid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="productname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantityperunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reorderlevel" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="supplierid" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="unitprice" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="unitsinstock" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="unitsonorder" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "products", propOrder = {
    "categoryid",
    "discontinued",
    "productid",
    "productname",
    "quantityperunit",
    "reorderlevel",
    "supplierid",
    "unitprice",
    "unitsinstock",
    "unitsonorder"
})
public class Products {

    protected Short categoryid;
    protected Short discontinued;
    protected Integer productid;
    protected String productname;
    protected String quantityperunit;
    protected Short reorderlevel;
    protected Short supplierid;
    protected Short unitprice;
    protected Short unitsinstock;
    protected Short unitsonorder;

    /**
     * 获取categoryid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCategoryid() {
        return categoryid;
    }

    /**
     * 设置categoryid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCategoryid(Short value) {
        this.categoryid = value;
    }

    /**
     * 获取discontinued属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDiscontinued() {
        return discontinued;
    }

    /**
     * 设置discontinued属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDiscontinued(Short value) {
        this.discontinued = value;
    }

    /**
     * 获取productid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * 设置productid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductid(Integer value) {
        this.productid = value;
    }

    /**
     * 获取productname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductname() {
        return productname;
    }

    /**
     * 设置productname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductname(String value) {
        this.productname = value;
    }

    /**
     * 获取quantityperunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityperunit() {
        return quantityperunit;
    }

    /**
     * 设置quantityperunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityperunit(String value) {
        this.quantityperunit = value;
    }

    /**
     * 获取reorderlevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReorderlevel() {
        return reorderlevel;
    }

    /**
     * 设置reorderlevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReorderlevel(Short value) {
        this.reorderlevel = value;
    }

    /**
     * 获取supplierid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSupplierid() {
        return supplierid;
    }

    /**
     * 设置supplierid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSupplierid(Short value) {
        this.supplierid = value;
    }

    /**
     * 获取unitprice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitprice() {
        return unitprice;
    }

    /**
     * 设置unitprice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitprice(Short value) {
        this.unitprice = value;
    }

    /**
     * 获取unitsinstock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitsinstock() {
        return unitsinstock;
    }

    /**
     * 设置unitsinstock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitsinstock(Short value) {
        this.unitsinstock = value;
    }

    /**
     * 获取unitsonorder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUnitsonorder() {
        return unitsonorder;
    }

    /**
     * 设置unitsonorder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUnitsonorder(Short value) {
        this.unitsonorder = value;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this, SerializerFeature.WRITE_MAP_NULL_FEATURES, SerializerFeature.QuoteFieldNames);
	}

}
