package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import parts.Costumer;
import parts.Sales;
import parts.Salesman;


public class ReaderMethods {
	String userhome = System.getProperty("user.home");
	File folder = new File(userhome + File.separator + "data" + File.separator + "in");
	
	ArrayList<Salesman> salesmanList = new ArrayList<>();
	ArrayList<Costumer> costumerList = new ArrayList<>();
	ArrayList<Sales> salesList = new ArrayList<>();
	String part1;
	String part2;
	String part3;
	String part4;
	public void readFile() throws IOException {
	for (File file : folder.listFiles()) {
		if (file.getName().endsWith(".dat")) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.ready()){
			   String line = br.readLine();
			   String[] parts = line.split("ç");
			   part1 = parts[0]; 
			   part2 = parts[1];
			   part3 = parts[2];
			   part4 = parts[3];
//			   Arrays.stream(parts).forEach(System.out::println);
			   if (part1.equals("001")) {
					Salesman s = new Salesman(part2, part3, part4);
					salesmanList.add(s);
					System.out.println(s.toString());
			   } else if (part1.equals("002")) {
				    Costumer c = new Costumer(part2, part3, part4);
					costumerList.add(c);
					System.out.println(c.toString());
			   } else if (part1.equals("003")) {
				    Sales sl = new Sales(part2, part3, part4);
					salesList.add(sl);
					System.out.println(sl.toString());
			   }
			}
//			System.out.println("Nenhum arquivo com esta extensão encontrado");
			}
		}
	}
		
	}
	


