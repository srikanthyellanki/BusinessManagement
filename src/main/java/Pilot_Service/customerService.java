package Pilot_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pilot_Model.Customer;


public interface customerService {
	
	public   abstract void addCustomer(Customer customer);
	public abstract  void deleteCustomer(Customer customer);
	public abstract  void updateCustomer(List Parameters,Customer customer);
	public  abstract List<Customer> retrieveCustomer();
	
	

}
