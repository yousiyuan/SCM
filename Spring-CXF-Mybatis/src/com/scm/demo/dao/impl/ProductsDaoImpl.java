package com.scm.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.scm.demo.dao.ProductsDao;
import com.scm.demo.entity.Products;

@Repository
public class ProductsDaoImpl extends BaseDaoImpl<Products> implements ProductsDao {

	@Override
	public int count(String sqlId) {
		return sqlSession.selectOne(sqlId);
	}

}
