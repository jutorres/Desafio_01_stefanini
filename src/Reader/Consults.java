package Reader;

import java.util.Comparator;
import java.util.Optional;

import parts.Item;
import parts.Sales;
import parts.Salesman;

public class Consults {
	private int amountCustomers;
	private int amountSalesman;
	private Item idMostExpensiveSale;
	private Item worstSalesman;
	
	public Consults(Repository repository) {
		amountCustomersCount(repository);
		amountSalesmanCount(repository);
		idMostExpensiveSale(repository);
		WorstSalesman(repository);
	}
	
//	private Object getWorstSalesmanEver(Repository repository) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private Object getMostExpensiveSale(Repository repository) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	private void WorstSalesman(Repository repository) {
		Sales sales = Repository.getSalesList().stream().min(Comparator.comparing(Sales::getTotalValue)).get();
		System.out.println(sales.getName());
	}

	private void idMostExpensiveSale(Repository repository) {
		Sales sales = Repository.getSalesList().stream().max(Comparator.comparing(Sales::getTotalValue)).get();
		System.out.println(sales.getSaleId());
	}
	
	public Item getWorstSalesman() {
		return worstSalesman;
	}

	public Item getIdMostExpensiveSale() {
		return idMostExpensiveSale;
	}

	public int getAmountCustomers() {
		return amountCustomers;
	}
	
	public int getAmountSalesman() {
		return amountSalesman;
	}
	
	private void amountCustomersCount(Repository repository) {
		amountCustomers = repository.getCustomerList().size();
	}
	private void amountSalesmanCount(Repository repository) {
		amountSalesman = repository.getSalesmanList().size();
	}
	
	@Override
	public String toString() {
		return "DataAnalyzer [amountCustomers=" + amountCustomers +
				", amountSalesman=" + amountSalesman +
				", idMostExpensiveSale=" + idMostExpensiveSale +
//				", worstSalesman=" + worstSalesman.getName() +
				"]";
	}
}
