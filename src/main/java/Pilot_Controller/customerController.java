package Pilot_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Pilot_Model.Customer;
import Pilot_Service.customerService;


@RestController
public class customerController {
	
	@Autowired
	private customerService customer_Service;

	
	@PostMapping("/")
	public void addCustomer(@RequestBody Customer customer)
	{
		customer_Service.addCustomer(customer);
	}
	
	
	@PostMapping("/")
	public void deleteCustomer(@RequestBody Customer customer)
	{
		customer_Service.deleteCustomer(customer);
	}
	
	
	@PostMapping("/")
	public void updateCustomer(@RequestBody List Parameters,@RequestBody Customer customer)
	{
		customer_Service.updateCustomer(Parameters,customer);
	}
	
	@GetMapping("/")
	public List<Customer> retrieveCustomer()
	{
		return customer_Service.retrieveCustomer();
	}
}
