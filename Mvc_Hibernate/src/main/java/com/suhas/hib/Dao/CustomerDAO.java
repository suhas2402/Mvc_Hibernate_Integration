package com.suhas.hib.Dao;


import java.util.List;

import com.suhas.hib.Model.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public void updatePerson(Customer theCustomer);
}
