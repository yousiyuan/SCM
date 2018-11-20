package com.scm.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.demo.dao.CustomersDao;
import com.scm.demo.entity.Customers;
import com.scm.demo.service.CustomerService;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customers> implements CustomerService {

	@Autowired
	private CustomersDao customerDao;

	public CustomerServiceImpl() {
		this.setInsertSqlId("mapper.CUSTOMERS.insertSelective");
		this.setUpdateSqlId("mapper.CUSTOMERS.updateByPrimaryKeySelective");
		this.setQuerySqlId("mapper.CUSTOMERS.selectByPrimaryKey");
		this.setDeleteSqlId("mapper.CUSTOMERS.deleteByPrimaryKey");
	}

	@Override
	public List<Customers> queryForList(String sqlId, Customers object) throws Exception {
		return customerDao.queryForList(sqlId, object);
	}

}
