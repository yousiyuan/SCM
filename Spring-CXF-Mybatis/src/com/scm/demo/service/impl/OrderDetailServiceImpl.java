package com.scm.demo.service.impl;

import org.springframework.stereotype.Service;

import com.scm.demo.entity.OrderDetails;
import com.scm.demo.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetails> implements OrderDetailService {

	public OrderDetailServiceImpl() {
		this.setInsertSqlId("mapper.ORDERDETAILS.insertSelective");
		this.setUpdateSqlId("mapper.ORDERDETAILS.updateByPrimaryKeySelective");
		this.setQuerySqlId("mapper.ORDERDETAILS.selectByPrimaryKey");
		this.setDeleteSqlId("mapper.ORDERDETAILS.deleteByPrimaryKey");
	}

}
