package interfaceOdev1;

public class NeroCustomerManager implements CustomerManager {
	@Override
	public void add(Customer customer) {
		System.out.println(customer.FirstName + " Nero ailesine ho�geldiniz");
	}

	@Override
	public void buyCoffee(Customer customer) {
			System.out.println(customer.FirstName + " afiyet olsun");
	}
}
