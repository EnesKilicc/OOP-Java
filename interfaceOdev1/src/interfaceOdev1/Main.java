package interfaceOdev1;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Enes", "Kýlýç", 1997, "12312412");
		StarbucksCustomerManager starbuckscstmrmngr = new StarbucksCustomerManager();
		NeroCustomerManager nerocstmrmngr = new NeroCustomerManager();
		nerocstmrmngr.add(customer);
		starbuckscstmrmngr.add(customer);
		starbuckscstmrmngr.buyCoffee(customer);
		
	}

}
