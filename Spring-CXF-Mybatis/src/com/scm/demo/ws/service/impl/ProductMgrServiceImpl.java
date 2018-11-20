package com.scm.demo.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.demo.entity.Products;
import com.scm.demo.service.ProductService;
import com.scm.demo.ws.service.ProductMgrService;

@Service
public class ProductMgrServiceImpl implements ProductMgrService {

	private final Logger logger = Logger.getLogger(CustomerMgrServiceImpl.class);

	@Autowired
	private ProductService productService;

	@Override
	public Integer saveProduct(Products product) {
		try {
			productService.insertObject(product);
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public Integer deleteProduct(Products product) {
		try {
			productService.insertObject(product);
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public Integer updateProduct(Products product) {
		try {
			productService.insertObject(product);
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public List<Products> getProductList(Products product) {
		logger.info("ProductMgrServiceImpl.getProductList(Products product)被调用");
		try {
			return productService.queryForList("mapper.PRODUCTS.queryProductByCondition", product);
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return new ArrayList<Products>();
		}
	}

	private void printExceptionMessage(Exception ex) {
		StringBuilder str = new StringBuilder();
		str.append(ex.getMessage() + "\r\n");
		for (StackTraceElement e : ex.getStackTrace()) {
			str.append(e.toString() + "\r\n");
		}
		logger.error(str.toString());
	}

}
