package constructor.library;

public class ProductInventory {

	int productId;
	String productName;
	double price;
	int quantityInStock;
	ProductInventory()
	{
		
	}
	ProductInventory(int productId,String productName,double price,int quantityInStock)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantityInStock=quantityInStock;
		
	}
	void show()
	{
		System.out.println("productId :"+productId);
		System.out.println("productName :"+productName);
		System.out.println("price :"+price);
		System.out.println("quantityInStock :"+quantityInStock);
	}
	public static void main(String[] args) {
		ProductInventory p = new ProductInventory(1275,"Onion",14.75,30000);
		p.show();
		System.out.println("---------------------------------------");
		ProductInventory p1 = new ProductInventory(1275,"Orange",147.500,39582);
		p1.show();
	}
}
