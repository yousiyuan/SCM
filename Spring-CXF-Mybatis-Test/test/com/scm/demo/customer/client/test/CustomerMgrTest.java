package com.scm.demo.customer.client.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.scm.demo.customer.client.CustomerMgr;
import com.scm.demo.customer.client.CustomerMgrPortType;
import com.scm.demo.customer.client.Customers;

public class CustomerMgrTest {

	private CustomerMgrPortType customerMgrPort;

	@Before
	public void setUp() throws Exception {
		CustomerMgr mgr = new CustomerMgr();
		customerMgrPort = mgr.getCustomerMgrPort();
	}

	@Test
	public void testSavePerson() {
		customerMgrPort.savePerson(null);
	}

	@Test
	public void testDeletePerson() {
		customerMgrPort.deletePerson(null);
	}

	@Test
	public void testUpdatePerson() {
		customerMgrPort.updatePerson(null);
	}

	@Test
	public void testGetPersonList() {
		List<Customers> personList = customerMgrPort.getPersonList(new Customers());
		System.out.println(personList);
	}
}
