package com.scm.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.scm.demo.dao.CustomersDao;
import com.scm.demo.entity.Customers;

@Repository
public class CustomersDaoImpl extends BaseDaoImpl<Customers> implements CustomersDao {

}
