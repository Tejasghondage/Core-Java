package statics.mathOperation;

public class InventoryItem {

	static int totalItems;
	String itemName;
	double quantity;
	InventoryItem(String itemName,double quantity)
	{
		this.itemName=itemName;
		this.quantity=quantity;
	}
	static int getTotalItems()
	{
		return totalItems;
	}
	void addToInventory(double quantity )
	{
		this.quantity +=quantity;
		totalItems++;
	}
	void removeFromInventory(double quantitiy)
	{
		this.quantity-=quantity;
		totalItems--;
	}
	public static void main(String[] args) {
		InventoryItem i = new InventoryItem("Onion",45.52);
		InventoryItem i1 = new InventoryItem("Onion",45.52);
		InventoryItem i2 = new InventoryItem("Onion",45.52);

		i.addToInventory(12520.52);
		i1.addToInventory(12520.52);
		i2.addToInventory(12520.52);
		int x=InventoryItem.getTotalItems();
		System.out.println(+x);
		i.removeFromInventory(2559.82);
		 x=InventoryItem.getTotalItems();
		System.out.println(+x);
	}
}
