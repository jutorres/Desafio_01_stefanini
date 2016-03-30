package parts;

public class Sales {
	    private static String saleId;
		private static String name;
		
		
		
		public Sales(String saleId, String name) {
			Sales.saleId = saleId;
			Sales.name = name;
		}

		public static String getSaleId() {
			return saleId;
		}
		
		public static String getName() {
			return name;
		}

		@Override
		public String toString() {
			  return "Sales: " + "\n" +
					  	"ID da venda: " + saleId + "\n" + 
					  	"Nome do vendedor: " + name + "\n";    
			 }

			
}


