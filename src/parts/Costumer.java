package parts;

public class Costumer {
	private String cnpj;
	private String name;
	private String area;
	
	public Costumer(String cnpj, String name, String area) {
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
}
