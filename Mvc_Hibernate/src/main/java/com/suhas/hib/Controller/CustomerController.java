package com.suhas.hib.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.suhas.hib.Model.Customer;
import com.suhas.hib.Service.CustomerService;





@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	

	@RequestMapping("/view")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers", theCustomers);
		for (Customer p : theCustomers) {
			System.out.println(p); 
		}
		return "list-customers";
	}

	@RequestMapping("/showForm")
	public String showFormForAdd(Model theModel, @ModelAttribute("customers") Customer customer) {
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@RequestMapping("/saveCustomer")
	public String saveCustomer(Customer customer) {
		if (customer.getId() == 0) {
			customerService.saveCustomer(customer);
		} else {
			customerService.updatePerson(customer);
		}

		return "redirect:/view";
	}

	@RequestMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("userId") int id, @ModelAttribute("customers") Customer customer,
			Model theModel) {
		Customer theCustomer = customerService.getCustomer(id);
		theModel.addAttribute("customers", theCustomer);
		return "customer-form";
	}

	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("userId") int id) {
		customerService.deleteCustomer(id);
		return "redirect:/view";
	}
}
