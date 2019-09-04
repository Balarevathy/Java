package cardealership;


public class Customer {
	private int customerID = 1;
	private char customerType ;
	private String chooseBank;
	public String getChooseBank() {
		return chooseBank;
	}

	public void setChooseBank(String chooseBank) {
		this.chooseBank = chooseBank;
	}

	public char getCustomerType() {
		return customerType;
	}

	public void setCustomerType(char customerType) {
		this.customerType = customerType;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public int generateCustomerID( int customerID)
	
	{
		customerID++;
		return customerID;
	}



	private String name;
	private String address;
	private int age;
	private char gender;
	private double cashOnHand;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	
	
	public void purchaseVehicle(Employee e1 , Vehicle v1,boolean finance,Bank b1)
	{
		e1.handleCustomer(this, v1, finance,b1);
	}

}
