package parts;

public class Sales {
	    private static String saleId;
		private static String infoItem;
		private static String name;
		
		public Sales(String saleId, String infoItem, String name) {
			Sales.saleId = saleId;
			Sales.infoItem = infoItem;
			Sales.name = name;
		}

		public static String getSaleId() {
			return saleId;
		}
		
		public static String getInfoItem() {
			return infoItem;
		}

		public static String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			  return "Sales: " + "\n" +
					  	"ID da venda: " + saleId + "\n" + 
					  	"Informações do item: " + infoItem + "\n" +
					  	"Nome do vendedor: " + name;    
			 }

			
}


