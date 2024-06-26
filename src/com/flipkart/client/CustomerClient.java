/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

/**
 * 
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// client -> business -> bean
		
		//create customerbusiness instance
		CustomerBusiness service= new CustomerBusiness();
		service.createCustomer();
		service.list();
		service.updateCustomer(10);
		service.list();
		service.deleteCustomer(20);
		service.list();

	}

}
