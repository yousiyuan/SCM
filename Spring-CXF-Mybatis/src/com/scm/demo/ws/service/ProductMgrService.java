package com.scm.demo.ws.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.scm.demo.entity.Products;

@WebService(serviceName = "ProductMgr", // 修改service节点的name
portName = "ProductMgrPort", // 修改port节点的name
name = "ProductMgrPortType"// 修改portType节点的name
)
public interface ProductMgrService {

	@WebResult(name = "result")
	public abstract Integer saveProduct(@WebParam(name = "product") Products product);

	@WebResult(name = "result")
	public abstract Integer deleteProduct(@WebParam(name = "product") Products product);

	@WebResult(name = "result")
	public abstract Integer updateProduct(@WebParam(name = "product") Products product);

	@WebResult(name = "result")
	public abstract List<Products> getProductList(@WebParam(name = "product") Products product);

}
