package desafio;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String userhome = System.getProperty("user.home");
		File folder = new File(userhome + File.separator + "data" + File.separator + "in");
//		System.out.println(folder.getAbsolutePath());
		
		for (File file : folder.listFiles()) {
			if (file.getName().endsWith(".dat")) {
				BufferedReader br = new BufferedReader(new FileReader(file));
				while(br.ready()){
				   String line = br.readLine();
				   String[] parts = line.split("�");
				   String part1 = parts[0]; 
				   String part2 = parts[1];
				   String part3 = parts[2];
				   String part4 = parts[3];
				   System.out.println(part1);
				   System.out.println(part2);
				   System.out.println(part3);
				   System.out.println(part4);
				}
				br.close();
			}
		}
		
		
		
	}
		
//		private static void process(String line) {
//			String campo1, campo2, campo3;
//			
//			if(line.trim().startsWith("001")) 
//				return;
//			
//			StringTokenizer tokenizer = new StringTokenizer(line, "�");
//				if(tokenizer.countTokens() < 3) 
//					return;
//				int cont = 0;
//				while(tokenizer.hasMoreTokens()) 
//				{
//					cont ++;
//					String token = tokenizer.nextToken(); 
//					switch(cont)
//					{
//						case 1: 
//							campo1 = token;
//							break;
//						case 2: 
//							campo2 = token;
//							break;
//						case 3:
//							campo3 = token;
//							break;
//						default:
//						
//						break;
//				} 
//			}
//			System.out.println("id: " + campo1);
//			System.out.print("Nome: " + campo2);
//			System.out.print("Tamanho: " + campo3);
//		}
	}
	

