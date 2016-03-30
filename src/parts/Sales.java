package parts;

import Reader.Repository;

public class Sales {
	    private int saleId;
		private String name;
		private Repository itemList;
		
		
		
		public Sales(int saleId, String name) {
			this.saleId = saleId;
			this.name = name;
		}

		public int getSaleId() {
			return saleId;
		}
		
		public String getName() {
			return name;
		}
		
		public double getTotalValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String toString() {
			  return "Sales: " + "\n" +
					  	"ID da venda: " + saleId + "\n" + 
					  	"Nome do vendedor: " + name + "\n";    
			 }
}


