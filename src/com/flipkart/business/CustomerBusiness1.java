/**
 * 
 */

// After replacing CustomerBusiness with ArrayList
package com.flipkart.business;

import com.flipkart.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class CustomerBusiness1 implements CustomerInterface  {
	List<Customer> customerlist = new ArrayList<Customer>();;
	// add, update, delete, list customer
	
	public void createCustomer() {
		System.out.println("Created");
		Customer customer1=new Customer();
		customer1.setCustomerId(10);
		customer1.setCustomerName("First Customer");
		customer1.setCustomerAddress("Address 1");
		customerlist.add(customer1);

		customer1=new Customer();
		customer1.setCustomerId(20);
		customer1.setCustomerName("Second Customer");
		customer1.setCustomerAddress("Address 2");
		customerlist.add(customer1);


		customer1=new Customer();
		customer1.setCustomerId(30);
		customer1.setCustomerName("Third Customer");
		customer1.setCustomerAddress("Address 3");
		customerlist.add(customer1);


		System.out.println();
	}
	
	public boolean updateCustomer(int customerId) {
		int flag=0, n=customerlist.size();

		for(Customer c:customerlist){
			if(c!=null && c.getCustomerId()==customerId){
				System.out.println("Updatedv Customer"+ customerId);
				c.setCustomerName("Modified CustomerName");
				c.setCustomerId(1000);
				c.setCustomerAddress("Modified Address 1");
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("Customer not found");
		}

		return true;
	}
	
	public boolean deleteCustomer(int customerId) {
		int flag=0;
		for(Customer c:customerlist){
			if(c!=null && c.getCustomerId()==customerId){
				System.out.println("Deleted Customer"+ customerId);
				flag=1;
				customerlist.remove(c);
			}
		}
		if(flag==0){
			System.out.println("Customer not found");
		}

		return true;
	}

	public void list(){
		System.out.println("List of Customers");
		for(Customer c:customerlist){
			if(c!=null)System.out.println("Customer-"+c.getCustomerId());
		}
	}

}
