package Pilot_Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Pilot_Model.Customer;
@Service
public class customerServiceImpl implements customerService {
	private List<Customer>customer_List;
@Autowired
private Customer customer;

@Override
public void addCustomer(Customer customer) {
	// TODO Auto-generated method stub
	
}
@Override
public void deleteCustomer(Customer customer) {
	// TODO Auto-generated method stub
	
}
@Override
public void updateCustomer(List Parameters, Customer customer) {
	// TODO Auto-generated method stub
	
}
@Override
public List<Customer> retrieveCustomer() {
	// TODO Auto-generated method stub
	return customer_List;
}

	

}
