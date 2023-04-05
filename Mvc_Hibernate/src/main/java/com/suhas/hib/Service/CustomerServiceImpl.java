package com.suhas.hib.Service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhas.hib.Dao.CustomerDAO;
import com.suhas.hib.Model.Customer;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerDAO customerDAO;

    @Transactional
    public List < Customer > getCustomers() {
        return customerDAO.getCustomers();
    }

    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDAO.saveCustomer(theCustomer);
    }

    @Transactional
    public Customer getCustomer(int theId) {
        return customerDAO.getCustomer(theId);
    }

    @Transactional
    public void deleteCustomer(int theId) {
        customerDAO.deleteCustomer(theId);
    }

	@Override
	public void updatePerson(Customer theCustomer) {
		customerDAO.updatePerson(theCustomer);
		
	}

}