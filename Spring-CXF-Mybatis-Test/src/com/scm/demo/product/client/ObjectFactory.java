
package com.scm.demo.product.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scm.demo.product.client package. 
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

    private final static QName _DeleteProduct_QNAME = new QName("http://service.ws.demo.scm.com/", "deleteProduct");
    private final static QName _DeleteProductResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "deleteProductResponse");
    private final static QName _GetProductList_QNAME = new QName("http://service.ws.demo.scm.com/", "getProductList");
    private final static QName _GetProductListResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "getProductListResponse");
    private final static QName _SaveProduct_QNAME = new QName("http://service.ws.demo.scm.com/", "saveProduct");
    private final static QName _SaveProductResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "saveProductResponse");
    private final static QName _UpdateProduct_QNAME = new QName("http://service.ws.demo.scm.com/", "updateProduct");
    private final static QName _UpdateProductResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "updateProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scm.demo.product.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteProduct }
     * 
     */
    public DeleteProduct createDeleteProduct() {
        return new DeleteProduct();
    }

    /**
     * Create an instance of {@link DeleteProductResponse }
     * 
     */
    public DeleteProductResponse createDeleteProductResponse() {
        return new DeleteProductResponse();
    }

    /**
     * Create an instance of {@link GetProductList }
     * 
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link SaveProduct }
     * 
     */
    public SaveProduct createSaveProduct() {
        return new SaveProduct();
    }

    /**
     * Create an instance of {@link SaveProductResponse }
     * 
     */
    public SaveProductResponse createSaveProductResponse() {
        return new SaveProductResponse();
    }

    /**
     * Create an instance of {@link UpdateProduct }
     * 
     */
    public UpdateProduct createUpdateProduct() {
        return new UpdateProduct();
    }

    /**
     * Create an instance of {@link UpdateProductResponse }
     * 
     */
    public UpdateProductResponse createUpdateProductResponse() {
        return new UpdateProductResponse();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "deleteProduct")
    public JAXBElement<DeleteProduct> createDeleteProduct(DeleteProduct value) {
        return new JAXBElement<DeleteProduct>(_DeleteProduct_QNAME, DeleteProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "deleteProductResponse")
    public JAXBElement<DeleteProductResponse> createDeleteProductResponse(DeleteProductResponse value) {
        return new JAXBElement<DeleteProductResponse>(_DeleteProductResponse_QNAME, DeleteProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "getProductList")
    public JAXBElement<GetProductList> createGetProductList(GetProductList value) {
        return new JAXBElement<GetProductList>(_GetProductList_QNAME, GetProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "getProductListResponse")
    public JAXBElement<GetProductListResponse> createGetProductListResponse(GetProductListResponse value) {
        return new JAXBElement<GetProductListResponse>(_GetProductListResponse_QNAME, GetProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "saveProduct")
    public JAXBElement<SaveProduct> createSaveProduct(SaveProduct value) {
        return new JAXBElement<SaveProduct>(_SaveProduct_QNAME, SaveProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "saveProductResponse")
    public JAXBElement<SaveProductResponse> createSaveProductResponse(SaveProductResponse value) {
        return new JAXBElement<SaveProductResponse>(_SaveProductResponse_QNAME, SaveProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "updateProduct")
    public JAXBElement<UpdateProduct> createUpdateProduct(UpdateProduct value) {
        return new JAXBElement<UpdateProduct>(_UpdateProduct_QNAME, UpdateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "updateProductResponse")
    public JAXBElement<UpdateProductResponse> createUpdateProductResponse(UpdateProductResponse value) {
        return new JAXBElement<UpdateProductResponse>(_UpdateProductResponse_QNAME, UpdateProductResponse.class, null, value);
    }

}
