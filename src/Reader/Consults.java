package Reader;

import java.util.Comparator;

import parts.Item;
import parts.Sales;

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
		
	public Consults() {
	}

	private String WorstSalesman(Repository repository) {
		Sales sales = Repository.getSalesList().stream().min(Comparator.comparing(Sales::getTotalValue)).get();
		return sales.getName();
	}

	private int idMostExpensiveSale(Repository repository) {
		Sales sales = Repository.getSalesList().stream().max(Comparator.comparing(Sales::getTotalValue)).get();
		return sales.getSaleId();
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
				", idMostExpensiveSale=" + idMostExpensiveSale(null) +
				", worstSalesman=" + WorstSalesman(null) +
				"]";
	}
}
