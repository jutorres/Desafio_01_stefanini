package parts;

public class Item {
	private static String idItem;
	private static String quantity;
	private static String price;
	
	public Item(String idItem, String quantity, String price) {
		Item.idItem = idItem;
		Item.quantity = quantity;
		Item.price = price;
 	}
	
	public static String getIdItem() {
		return idItem;
	}
	
	public static String getQuantity() {
		return quantity;
	}
	
	public static String getPrice() {
		return price;
	}
	
	public String toString() {
		  return   	"Informações dos itens vendido: " + "\n" +
				    "ID do item: " + idItem + "\n" + 
				  	"Quantidade do item: " + quantity + "\n" +
				  	"Preço do item: " + price + "\n";    
		 }
	
	
}
