package desafio;

import java.io.IOException;

import Reader.Consults;
import Reader.ReaderMethods;
import Reader.Repository;
import writer.WriterMethod;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		ReaderMethods r = new ReaderMethods();
		Repository repository = r.readFile();
		
		WriterMethod w = new WriterMethod();
		w.writeFile();
		
		Consults c = new Consults(repository);
		System.out.println(c);
   		}
		
}
	

