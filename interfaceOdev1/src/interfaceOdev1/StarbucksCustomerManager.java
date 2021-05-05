package interfaceOdev1;

public class StarbucksCustomerManager implements CustomerManager,CustomerCheckManager{

	@Override
	public void add(Customer customer) {
		if(CheckIfRealPerson(customer))
			System.out.println(customer.FirstName + " Starbucks ailesine hoþgeldiniz");
		 
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

	@Override
	public void buyCoffee(Customer customer) {
		System.out.println(customer.FirstName + " kahve satýn alarak bir yýldýz kazandýnýz afiyet olsun");
	}

}
