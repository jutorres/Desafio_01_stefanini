package Reader;

import parts.Item;
import parts.Sales;
import parts.Salesman;

public class Consults {
	private int amountCustomers;
	private int amountSalesman;
//	private int idMostExpensiveSale;
//	private Salesman worstSalesman;
	
	public Consults(Repository repository) {
		amountCustomersCount(repository);
		amountSalesmanCount(repository);
//		setIdMostExpensiveSale(getMostExpensiveSale(repository));
//		setWorstSalesman(getWorstSalesmanEver(repository));
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
	
	public int getAmountCustomers() {
		return amountCustomers;
	}
	
	public int getAmountSalesman() {
		return amountSalesman;
	}
	
//	public int getIdMostExpensiveSale() {
//		return idMostExpensiveSale;
//	}
//	
//	public Salesman getWorstSalesman() {
//		return worstSalesman;
//	}
	
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
//				", idMostExpensiveSale=" + idMostExpensiveSale +
//				", worstSalesman=" + worstSalesman.getName() +
				"]";
	}
	
	
}
