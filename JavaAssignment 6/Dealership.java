package cardealership;


public class Dealership {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer ();
		c1.setCustomerType('E');
		c1.setName("Kam");
		c1.setCustomerID(1);
		c1.setAge(18);
		c1.setGender('F');
		c1.setCashOnHand(700000);
		
		
		Vehicle v1 = new Vehicle();
		v1.setMake("Ford");
		v1.setModel("2019");
		v1.setPrice(1000000);
		
		Employee e1 = new Employee();
		e1.setName("Lee");
		e1.setFeedback("Excellent");
		boolean finance = true;
		Bank b1 = new BANKONE();
	//	Bank b2 = new BANKTWO();
	
		if (finance)
		{
		c1.purchaseVehicle(e1, v1, finance,b1);
		}
		else
		{
			c1.purchaseVehicle(e1, v1, finance,null);
		}
		

	}

}
