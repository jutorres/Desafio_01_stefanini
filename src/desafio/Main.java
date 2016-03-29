package desafio;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		String userhome = System.getProperty("user.home");
		FileReader file = new FileReader(userhome + File.separator + "data" + File.separator + "in" + File.separator + "kkk.dat");
		
		System.out.println(file);
		
	}
		
//		private static void process(String line) {
//			String ip, nomearquivo, tamanho;
//			ip = nomearquivo = tamanho = "";
//			if(line.trim().startsWith("#")) 
//				return;
//			StringTokenizer tokenizer = new StringTokenizer(line, " ");
//			if(tokenizer.countTokens() < 3) 
//				return;
//			int cont = 0;
//			while(tokenizer.hasMoreTokens()) 
//			{
//				cont ++;
//				String token = tokenizer.nextToken(); 
//				switch(cont)
//				{
//					case 1: 
//						ip = token;
//						break;
//					case 2: 
//						nomearquivo = token;
//						break;
//					case 3:
//						tamanho = token;
//						break;
//					default:
//						
//						break;
//				} 
//			}
//			System.out.print("IP: " + ip);
//			System.out.print( " " );
//			System.out.print("NomeArquivo: " + nomearquivo);
//			System.out.print( " " );
//			System.out.print("Tamanho: " + tamanho );
//			System.out.println(); // \n
//		}
	}
	

