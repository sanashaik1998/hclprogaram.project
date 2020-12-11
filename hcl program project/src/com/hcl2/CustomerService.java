package com.hcl2;

import java.util.List;



public interface CustomerService {
	boolean addCustomer(Customer customer);

	boolean deleteCustomer(int id);

	List<Customer> getCustomers();
}
