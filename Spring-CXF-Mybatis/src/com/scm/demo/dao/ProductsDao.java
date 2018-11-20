package com.scm.demo.dao;

import com.scm.demo.entity.Products;

public interface ProductsDao extends BaseDao<Products> {

	public abstract int count(String sqlId);

}
