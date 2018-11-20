
package com.scm.demo.customer.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.scm.demo.customer.client package. 
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

    private final static QName _DeletePerson_QNAME = new QName("http://service.ws.demo.scm.com/", "deletePerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "deletePersonResponse");
    private final static QName _GetPersonList_QNAME = new QName("http://service.ws.demo.scm.com/", "getPersonList");
    private final static QName _GetPersonListResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "getPersonListResponse");
    private final static QName _SavePerson_QNAME = new QName("http://service.ws.demo.scm.com/", "savePerson");
    private final static QName _SavePersonResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "savePersonResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://service.ws.demo.scm.com/", "updatePerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://service.ws.demo.scm.com/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.scm.demo.customer.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonList }
     * 
     */
    public GetPersonList createGetPersonList() {
        return new GetPersonList();
    }

    /**
     * Create an instance of {@link GetPersonListResponse }
     * 
     */
    public GetPersonListResponse createGetPersonListResponse() {
        return new GetPersonListResponse();
    }

    /**
     * Create an instance of {@link SavePerson }
     * 
     */
    public SavePerson createSavePerson() {
        return new SavePerson();
    }

    /**
     * Create an instance of {@link SavePersonResponse }
     * 
     */
    public SavePersonResponse createSavePersonResponse() {
        return new SavePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "getPersonList")
    public JAXBElement<GetPersonList> createGetPersonList(GetPersonList value) {
        return new JAXBElement<GetPersonList>(_GetPersonList_QNAME, GetPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "getPersonListResponse")
    public JAXBElement<GetPersonListResponse> createGetPersonListResponse(GetPersonListResponse value) {
        return new JAXBElement<GetPersonListResponse>(_GetPersonListResponse_QNAME, GetPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "savePerson")
    public JAXBElement<SavePerson> createSavePerson(SavePerson value) {
        return new JAXBElement<SavePerson>(_SavePerson_QNAME, SavePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "savePersonResponse")
    public JAXBElement<SavePersonResponse> createSavePersonResponse(SavePersonResponse value) {
        return new JAXBElement<SavePersonResponse>(_SavePersonResponse_QNAME, SavePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.demo.scm.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
