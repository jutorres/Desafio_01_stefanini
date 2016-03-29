package parts;

public class Sales {
	    private String saleId;
		private String infoItem;
		private String name;
		
		public Sales(String saleId, String infoItem, String name) {
			this.saleId = saleId;
			this.infoItem = infoItem;
			this.name = name;
		}

		public String getSaleId() {
			return saleId;
		}
		
		public String getInfoItem() {
			return infoItem;
		}

				public String getName() {
			return name;
		}

		
		
}


