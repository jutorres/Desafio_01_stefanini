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
	int r;
	int w;
	double y;

	public Repository readFile() throws IOException {
			Repository repository = new Repository();
			for (File file : folder.listFiles()) {
				if (file.getName().endsWith(".dat")) {
					@SuppressWarnings("resource")
					BufferedReader br = new BufferedReader(new FileReader(file));
					while(br.ready()){
						String line = br.readLine();
						line = line.replace("[", "");
						line = line.replace("]", "");
						String[] parts = line.split("ç");
						part1 = parts[0]; 
						part2 = parts[1];
						part3 = parts[2];
						part4 = parts[3];

						//			   Arrays.stream(parts).forEach(System.out::println);
						if (part1.equals("001")) {
							double s = Double.parseDouble(part4);
							Salesman salesman = new Salesman(part2, part3, s);
							repository.add(salesman);
						} else if (part1.equals("002")) {
							Customer customer = new Customer(part2, part3, part4);
							repository.add(customer);
						} else if (part1.equals("003")) {
							int x = Integer.parseInt(part2);
							Sales sales = new Sales(x, part4);
							repository.add(sales);

							String[] itemPart = part3.split(",");
							item1 = itemPart[0];
							item2 = itemPart[1];
							item3 = itemPart[2];
							
							String[] infoPart3 = item1.split("-");
							String sale1 = infoPart3[0];
							String sale2 = infoPart3[1];
							String sale3 = infoPart3[2];
							int r = Integer.parseInt(sale1);
							int w = Integer.parseInt(sale2);
							double y = Double.parseDouble(sale3);
							Item item = new Item(r, w, y);
							repository.add(item);
							
							String[] infoPart1 = item2.split("-");
							String sale4 = infoPart1[0];
							String sale5 = infoPart1[1];
							String sale6 = infoPart1[2];
							int r1 = Integer.parseInt(sale4);
							int w1 = Integer.parseInt(sale5);
							double y1 = Double.parseDouble(sale6);
							Item item1 = new Item(r1, w1, y1);
							repository.add(item1);
							
							String[] infoPart2 = item3.split("-");
							String sale7 = infoPart2[0];
							String sale8 = infoPart2[1];
							String sale9 = infoPart2[2];
							int r2 = Integer.parseInt(sale7);
							int w2 = Integer.parseInt(sale8);
							double y2 = Double.parseDouble(sale9);
							Item item2 = new Item(r2, w2, y2);
							repository.add(item2);
							
							

						}
					}
				}
			}
			return repository;
	}
}



