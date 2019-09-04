package cardealership;

public class BANKTWO implements Bank{
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterestRate()
	{
		return 8.25;
	}

}
