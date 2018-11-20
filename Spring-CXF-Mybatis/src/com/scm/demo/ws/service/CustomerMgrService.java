package com.scm.demo.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

import com.scm.demo.entity.Customers;

@WebService(serviceName = "CustomerMgr", // 修改service节点的name
		portName = "CustomerMgrPort", // 修改port节点的name
		name = "CustomerMgrPortType"// 修改portType节点的name
)
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CustomerMgrService {

	@WebResult(name = "result")
	public abstract Integer savePerson(@WebParam(name = "person") Customers person);

	@WebResult(name = "result")
	public abstract Integer deletePerson(@WebParam(name = "person") Customers person);

	@WebResult(name = "result")
	public abstract Integer updatePerson(@WebParam(name = "person") Customers person);

	@WebResult(name = "result")
	public abstract List<Customers> getPersonList(@WebParam(name = "person") Customers person);

}
