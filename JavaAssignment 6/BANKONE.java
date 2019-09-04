package cardealership;

public class BANKONE implements Bank{
	private String name;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public double getInterestRate()
{
	return 9.25;
}
}
