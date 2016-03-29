package parts;

public class Customer {
	private static String cnpj;
	private static String name;
	private static String area;
	
	public Customer(String cnpj, String name, String area) {
		Customer.cnpj = cnpj;
		Customer.name = name;
		Customer.area = area;
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
