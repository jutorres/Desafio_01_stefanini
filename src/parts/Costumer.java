package parts;

public class Costumer {
	private static String cnpj;
	private static String name;
	private static String area;
	
	public Costumer(String cnpj, String name, String area) {
		Costumer.cnpj = cnpj;
		Costumer.name = name;
		Costumer.area = area;
	}
	
	public static String getArea() {
		return area;
	}
	
	public static String getCnpj() {
		return cnpj;
	}
	
	public static String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		  return "Costumer:" + "\n" +
				  		"CNPJ do comprador: " + cnpj + "\n" + 
				  		"Nome do comprador: " + name + "\n" +
				  		"Área de trabalho: " + area;    
		 }
}
