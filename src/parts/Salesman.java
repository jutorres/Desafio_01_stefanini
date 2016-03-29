package parts;

public class Salesman {
	public static String cpf;
	private static String name;
	private static String salary;
	
	public Salesman(String cpf, String name, String salary) {
		Salesman.cpf = cpf;
		Salesman.name = name;
		Salesman.salary = salary;
	}

	public static String getCpf() {
		return cpf;
	}
	
	public static String getName() {
		return name;
	}
	
	public static String getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		  return "Salesman:" + "\n" +
				  		"CPF do vendedor: " + cpf + "\n" + 
				  		"Nome do vendedor: " + name + "\n" +
				  		"Salário do vendedor: " + salary;    
		 }
	
	

		
	
	
	
}
