package Reader;

import java.util.ArrayList;
import parts.Customer;
import parts.Sales;
import parts.Salesman;

public class Repository {
	private ArrayList<Salesman> salesmanList;
	private ArrayList<Customer> customerList;
	private ArrayList<Sales> salesList;
	
	public Repository() {
		this.salesmanList = new ArrayList<Salesman>();
		this.customerList = new ArrayList<Customer>();
		this.salesList = new ArrayList<Sales>();
	}

	public ArrayList<Salesman> getSalesmanList() {
		return salesmanList;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public ArrayList<Sales> getSalesList() {
		return salesList;
	}
	
	public void addSalesman(Salesman salesman) {
		getSalesmanList().add(salesman);
	}
	public void addCustomer(Customer customer) {
		getCustomerList().add(customer);
	}
	public void addSale(Sales sales) {
		getSalesList().add(sales);
	}
	
	@Override
	public String toString() {
		System.out.println("Salesmans size: " + getSalesmanList().size());
		System.out.println("Customers size: " + getCustomerList().size());
		System.out.println("Sales size: " + getSalesList().size());
		return "";
	}

	public void add(Salesman salesman) {
		// TODO Auto-generated method stub
		
	}
	
	
}
