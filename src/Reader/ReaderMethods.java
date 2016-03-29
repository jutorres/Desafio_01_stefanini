package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMethods {
	String userhome = System.getProperty("user.home");
	File folder = new File(userhome + File.separator + "data" + File.separator + "in");
	
	
	public void readFile() throws IOException {
	for (File file : folder.listFiles()) {
		if (file.getName().endsWith(".dat")) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while(br.ready()){
			   String line = br.readLine();
			   String[] parts = line.split("ç");
			   String part1 = parts[0]; 
			   String part2 = parts[1];
			   String part3 = parts[2];
			   String part4 = parts[3];
//			   if (part1.equals("001")) {
//			   		salesmanCpf = part2;
//			   		salesmanName = part3;
//			   		salesmanSalary = Double.parseDouble(part4);
//			   } else if (part1.equals("002")) {
//				    costumerCnpj = part2;
//			   		costumerName = part3;
//			   		costumerArea = part4;
//			   } else if (part1.equals("003")) {
//				    saleId = Integer.parseInt(part2);
//			   		infoItem = part3;
//			   		salesmanName = part4;
//			   }
			   System.out.println(part1);
			}
			
		}
		
	}
		
	}
	

}
