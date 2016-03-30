package desafio;

import java.io.IOException;
import Reader.ReaderMethods;
import Reader.Repository;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		ReaderMethods r = new ReaderMethods();
		Repository repository = r.readFile();
		
		System.out.println(repository.getSalesmanList().toString());
	
		
		
		
		
		
		
		
   		
   		
   		}
		
}
	

