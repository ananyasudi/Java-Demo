/**
 * 
 */
package com.flipkart.business;

import com.flipkart.bean.Customer;

/**
 * 
 */
public class CustomerBusiness implements CustomerInterface  {
	Customer[] customer = new Customer[3];
	// add, update, delete, list customer
	
	public void createCustomer() {
		System.out.println("Created");
		customer[0]=new Customer();
		customer[0].setCustomerId(10);
		customer[0].setCustomerName("First Customer");
		customer[0].setCustomerAddress("Address 1");

		customer[1]=new Customer();
		customer[1].setCustomerId(20);
		customer[1].setCustomerName("Second Customer");
		customer[1].setCustomerAddress("Address 2");

		customer[2]=new Customer();
		customer[2].setCustomerId(30);
		customer[2].setCustomerName("Third Customer");
		customer[2].setCustomerAddress("Address 3");


		System.out.println();
	}
	
	public boolean updateCustomer(int customerId) {
		int flag=0;
		for(Customer c:customer){
			if(c!=null && c.getCustomerId()==customerId){
				System.out.println("Updated Customer"+ customerId);
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
		for(int i=0;i<customer.length;i++){
			if(customer[i]!=null && customer[i].getCustomerId()==customerId){
				System.out.println("Deleted Customer"+ customerId);
				flag=1;
				customer[i]=null;
			}
		}
		if(flag==0){
			System.out.println("Customer not found");
		}

		return true;
	}

	public void list(){
		System.out.println("List of Customers");
		for(Customer c:customer){
			if(c!=null)System.out.println("Customer-"+c.getCustomerId());
		}
	}

}
