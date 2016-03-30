package Reader;

import java.util.ArrayList;
import parts.Customer;
import parts.Item;
import parts.Sales;
import parts.Salesman;

public class Repository {
	private ArrayList<Salesman> salesmanList;
	private ArrayList<Customer> customerList;
	private static ArrayList<Sales> salesList;
	private static ArrayList<Item> itemList;
	
	public Repository() {
		this.salesmanList = new ArrayList<Salesman>();
		this.customerList = new ArrayList<Customer>();
		this.salesList = new ArrayList<Sales>();
		Repository.itemList = new ArrayList<Item>();
	}

	public ArrayList<Salesman> getSalesmanList() {
		return salesmanList;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public static ArrayList<Sales> getSalesList() {
		return salesList;
	}
	
	public static ArrayList<Item> getItemList() {
		return itemList;
	}
	
	public void add(Salesman salesman) {
		salesmanList.add(salesman);
	}

	public void add(Customer customer) {
		customerList.add(customer);
	}

	public void add(Sales sales) {
		salesList.add(sales);
	}
	
	public void add(Item itens) {
		itemList.add(itens);
	}
	
	@Override
	public String toString() {
		System.out.println("Salesmans size: " + getSalesmanList().size());
		System.out.println("Customers size: " + getCustomerList().size());
		System.out.println("Sales size: " + getSalesList().size());
		System.out.println("Item size: " + getItemList().size());
		return "";
	}
	
}
