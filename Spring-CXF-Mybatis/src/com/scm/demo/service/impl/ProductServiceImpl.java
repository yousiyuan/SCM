package com.scm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.demo.dao.ProductsDao;
import com.scm.demo.entity.Products;
import com.scm.demo.service.ProductService;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Products> implements ProductService {

	@Autowired
	private ProductsDao productDao;

	public ProductServiceImpl() {
		//动态插入
		this.setInsertSqlId("mapper.PRODUCTS.insertSelective");
		//动态更新
		this.setUpdateSqlId("mapper.PRODUCTS.updateByPrimaryKeySelective");
		//根据主键查询单条数据
		this.setQuerySqlId("mapper.PRODUCTS.selectByPrimaryKey");
		//根据主键删除
		this.setDeleteSqlId("mapper.PRODUCTS.deleteByPrimaryKey");
	}

	/**
	 * 统计总记录数
	 */
	@Override
	public int count() {
		return productDao.count("mapper.PRODUCTS.count");
	}

	/**
	 * 动态查询
	 */
	@Override
	public List<Products> queryForList(String sqlId, Products object) {
		return productDao.queryForList(sqlId, object);
	}

}
