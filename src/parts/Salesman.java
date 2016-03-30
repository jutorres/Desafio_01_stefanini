package parts;

public class Salesman {
	public String cpf;
	private String name;
	private Double salary;
	
	public Salesman(String cpf, String name, Double salary) {
		this.cpf = cpf;
		this.name = name;
		this.salary = salary;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		  return "Salesman:" + "\n" +
				  		"CPF do vendedor: " + cpf + "\n" + 
				  		"Nome do vendedor: " + name + "\n" +
				  		"Salário do vendedor: " + salary + "\n";    
		 }
	
	

		
	
	
	
}
