package statics.mathOperation;

public class Product {
	String productId;
	String productName;
	double prise;
	int quantity;
	static String storeName;
	static int totalProducts;
	Product()
	{
		this.productId="Unknown";
		this.productName="Unknown";
		this.prise=0.0;
		this.quantity=0;
	}
	Product(String productId, String productName, double prise,int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.prise=prise;
		this.quantity=quantity;
	}
	void addStock(int amount)
	{
		this.quantity+=amount;
		System.out.println("Quantaty increased by :"+amount);
	}
	void sellProduct(int amount)
	{
		this.quantity-=amount;
		System.out.println("Quantaty decreased by :"+amount);
	}
	static void setStoreName(String name) {
		Product.storeName=name;	
	}
	static void printTotalProducts() {
		System.out.println("Totol number of products :"+Product.totalProducts);
	}
	static void printAllProducts(Product[] products)
	{
		for(Product p :products)
		{
			System.out.println("Product ID :"+p.productId+"Product Name :"+p.productName+" Product Prise :"+p.prise+" Prodct quantity :"+p.quantity);
		}
	}
	void printProductDetails()
	{
		System.out.println("Product ID:"+this.productId+"Product Name "+this.productName+" Product Prise"+this.prise+" Prodct quantity :"+this.quantity);

	}
	public static void main(String[] args) {
		Product[] p= {
				new Product("NC2152","Ganja",452582582.56,1557869),
				new Product("NC21+12","Manja",452582582.56,1557869),
				new Product("NC21-82","Sanja",452582582.56,1557869),
		};
		p[1].addStock(45250);
		p[2].sellProduct(4444);
		Product.setStoreName("Trupti");
		Product.printTotalProducts();
		Product.printAllProducts(p);
		
		p[1].printProductDetails();
		
	}
}
