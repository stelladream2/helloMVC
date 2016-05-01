package util;
import java.util.HashMap;
import java.util.Map;

import beans.Customer;

/** A small table of  customers for testing. */

public class CustomerMap {
	private Map<String,Customer> customers;

	  public CustomerMap() {
	    customers = new HashMap<String,Customer>();
	    addCustomer(new Customer("id001", "Alice", 
	                             "alice@hansung.ac.kr"));
	    addCustomer(new Customer("id002", "Bob",
	                             "bob@hansung.ac.kr"));
	    addCustomer(new Customer("id003", "Charlie",
	                             "charlie@hansung.ac.kr"));
	    addCustomer(new Customer("id004", "Jane",
                "jane@hansung.ac.kr"));
	    addCustomer(new Customer("id005", "Trudy",
                "trudy@hansung.ac.kr"));
            addCustomer(new Customer("id006", "Stacy",
                "stacy@hansung.ac.kr"));
	    addCustomer(new Customer("id007", "Lexi",
                "lexi@hansung.ac.kr"));
	  }

	  /** Finds the customer with the given ID.
	   *  Returns null if there is no match.
	   */
	  
	  public Customer findCustomer(String id) {
	    if (id!=null) {
	      return(customers.get(id.toLowerCase()));
	    } else {
	      return(null);
	    }
	  }

	  private void addCustomer(Customer customer) {
	    customers.put(customer.getId(), customer);
	  }
}
