package atm1;

public class Bank implements BankingServicesInterface{
	String bank = null;
	
	public Bank (String bank)
	{
		this.bank = bank ;
	}

	@Override
	public double assignServiceCharge() {
		double serviceCharge = 0.0;
		// TODO Auto-generated method stub
		if (this.bank.equals("ICICI"))
		{
			serviceCharge = 25;
		}
		else if (this.bank.equals("AXIS"))
		{
			serviceCharge = 20;
		}
		
		return serviceCharge;
	}

}
