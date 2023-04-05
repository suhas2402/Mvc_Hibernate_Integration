package com.suhas.hib.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suhas.hib.Model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> getCustomers() {

		Session session = sessionFactory.getCurrentSession();
		List<Customer> personsList = session.createQuery("from Customer").list();

		return personsList;
	}

	@Transactional
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer book = session.byId(Customer.class).load(id);
		session.delete(book);
	}

	@Transactional
	public void saveCustomer(Customer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.persist(theCustomer);
	}

	@Transactional
	public Customer getCustomer(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer theCustomer = currentSession.get(Customer.class, id);
		return theCustomer;
	}

	@Transactional
	public void updatePerson(Customer theCustomer) {
		Session session = sessionFactory.getCurrentSession();
		session.update(theCustomer);
	}
}