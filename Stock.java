package statics.mathOperation;

public class Stock {
static int totalStocks;
String tickerSymbol;
double currentPrise;
Stock(String tickerSymbol,double currentPrise)
{
	this.tickerSymbol=tickerSymbol;
	this.currentPrise=currentPrise;
	totalStocks++;
}
static int getTotalStocks()
{
	return totalStocks;
}
void updatePrice(double currentPrise)
{
	this.currentPrise+=currentPrise;
}
void displayStockInfo()
{
	System.out.println("Tincker Symbol :"+this.tickerSymbol);
	System.out.println("Current Prise  :"+this.currentPrise);
}
public static void main(String[] args) {
	Stock s = new Stock("APPL",1225254.52298);
	Stock s1 = new Stock("META",522524.52298);
	Stock s2 = new Stock("AMZN",59625254.52298);
	s.updatePrice(2153.52);
	s.displayStockInfo();
	double x =Stock.getTotalStocks();
	System.out.println("total number of stocks :"+x);

}
}
