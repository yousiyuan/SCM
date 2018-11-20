package com.scm.demo.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.demo.entity.Customers;
import com.scm.demo.service.CustomerService;
import com.scm.demo.ws.service.CustomerMgrService;

@Service
public class CustomerMgrServiceImpl implements CustomerMgrService {

	private final Logger logger = Logger.getLogger(CustomerMgrServiceImpl.class);

	@Autowired
	private CustomerService customerService;

	@Override
	public Integer savePerson(Customers person) {
		try {
			customerService.insertObject(person);
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public Integer deletePerson(Customers person) {
		try {
			customerService.deleteObject(person.getCustomerid());
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public Integer updatePerson(Customers person) {
		try {
			customerService.updateObject(person);
			return 1;
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return 0;
		}
	}

	@Override
	public List<Customers> getPersonList(Customers person) {
		logger.info("CustomerMgrServiceImpl.getPersonList(Customers person)方法被调用");
		try {
			return customerService.queryForList("mapper.CUSTOMERS.queryCustomerByCondition", person);
		} catch (Exception ex) {
			printExceptionMessage(ex);
			return new ArrayList<Customers>();
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
