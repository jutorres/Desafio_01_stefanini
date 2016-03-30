package desafio;

import java.io.IOException;

import Reader.Consults;
import Reader.ReaderMethods;
import Reader.Repository;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		ReaderMethods r = new ReaderMethods();
		Repository repository = r.readFile();
		
		System.out.println(repository.getSalesmanList().toString());
		System.out.println(repository.getCustomerList().toString());
		System.out.println(repository.getSalesList().toString());
		System.out.println(repository.getItemList().toString());
		
		Consults c = new Consults(repository);
		System.out.println(c);
		
   		}
		
}
	

