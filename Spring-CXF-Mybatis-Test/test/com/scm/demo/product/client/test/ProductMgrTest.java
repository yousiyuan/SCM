package com.scm.demo.product.client.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.scm.demo.product.client.ProductMgr;
import com.scm.demo.product.client.ProductMgrPortType;
import com.scm.demo.product.client.Products;

public class ProductMgrTest {

	private ProductMgrPortType productMgrPort;

	@Before
	public void setUp() throws Exception {
		ProductMgr mgr = new ProductMgr();
		productMgrPort = mgr.getProductMgrPort();
	}

	@Test
	public void testSaveProduct() {
		productMgrPort.saveProduct(null);
	}

	@Test
	public void testDeleteProduct() {
		productMgrPort.deleteProduct(null);
	}

	@Test
	public void testUpdateProduct() {
		productMgrPort.updateProduct(null);
	}

	@Test
	public void testGetProductList() {
		List<Products> productList = productMgrPort.getProductList(new Products());
		System.out.println(productList);
	}

}
