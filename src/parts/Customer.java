package parts;

public class Customer {
	private String cnpj;
	private String name;
	private String area;
	
	public Customer(String cnpj, String name, String area) {
		this.cnpj = cnpj;
		this.name = name;
		this.area = area;
	}
	
	public String getArea() {
		return area;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		  return "Costumer:" + "\n" +
				  		"CNPJ do comprador: " + cnpj + "\n" + 
				  		"Nome do comprador: " + name + "\n" +
				  		"Área de trabalho: " + area + "\n";    
		 }
}
