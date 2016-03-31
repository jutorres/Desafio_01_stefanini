package parts;

public class Item {
	private int idItem;
	private int quantity;
	private double price;
	
	public Item(int idItem, int quantity, double price) {
		this.idItem = idItem;
		this.quantity = quantity;
		this.price = price;
 	}
	
	public int getIdItem() {
		return idItem;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		  return   	"Informa��es dos itens vendido: " + "\n" +
				    "ID do item: " + idItem + "\n" + 
				  	"Quantidade do item: " + quantity + "\n" +
				  	"Pre�o do item: " + price + "\n";    
		 }
	
	
}
