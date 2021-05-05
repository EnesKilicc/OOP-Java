package interfaceOdev1;

public class Customer {
	public int Id;
	public String FirstName;
	public String LastName;
	public int DateOfBirth;
	public String NationalityId;
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}

}
