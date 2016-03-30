package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import parts.Customer;
import parts.Item;
import parts.Sales;
import parts.Salesman;


public class ReaderMethods {
	String userhome = System.getProperty("user.home");
	File folder = new File(userhome + File.separator + "data" + File.separator + "in");
	
	String part1;
	String part2;
	String part3;
	String part4;
	String item1;
	String item2;
	String item3;
	
	public Repository readFile() throws IOException {
		Repository repository = new Repository();
		for (File file : folder.listFiles()) {
			if (file.getName().endsWith(".dat")) {
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(new FileReader(file));
				while(br.ready()){
				   String line = br.readLine();
				   line = line.replace("[", " ");
				   line = line.replace("]", " ");
				   String[] parts = line.split("ç");
				   part1 = parts[0]; 
				   part2 = parts[1];
				   part3 = parts[2];
				   part4 = parts[3];
				   
	//			   Arrays.stream(parts).forEach(System.out::println);
				   if (part1.equals("001")) {
						Salesman salesman = new Salesman(part2, part3, part4);
						repository.add(salesman);
				   } else if (part1.equals("002")) {
					    Customer customer = new Customer(part2, part3, part4);
						repository.add(customer);
				   } else if (part1.equals("003")) {
					   	Sales sales = new Sales(part2, part4);
						repository.add(sales);
						String[] itemPart = part3.split("-");
						item1 = itemPart[0];
						item2 = itemPart[1];
						item3 = itemPart[2];
						Item itens = new Item(item1, item2, item3);
						repository.add(itens);
				   }
				}
	//			System.out.println("Nenhum arquivo com esta extensão encontrado");
				}
			}
			return repository;
		}
			
	}
	


