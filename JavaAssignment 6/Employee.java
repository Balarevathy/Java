package cardealership;

import java.text.DecimalFormat;


public class Employee implements CustomerInterface {
	private String Name;
	DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	private String feedback;
	
	public void handleCustomer(Customer c1,Vehicle v1 ,boolean finance,Bank b1)
		{
		
		if (finance)
		{
			
			double loanAmount = v1.getPrice() - c1.getCashOnHand() - this.getRateForUsedVeh()- discountOnBasePrice(c1,v1);
			System.out.println("getPrice "+v1.getPrice());
			System.out.println("getCashOnHand "+c1.getCashOnHand());
			System.out.println("getRateForUsedVeh "+getRateForUsedVeh());
			System.out.println("discountOnBasePrice "+discountOnBasePrice(c1,v1));
			
			
			if (loanAmount > 0)
			processLoan(c1,loanAmount,b1);
			else
				System.out.println("Loan Applied must be greater than 0");
			
		}
			else
			{
				processTransaction(c1,v1);
			
			
		}
		
		System.out.println ("This deal is handled by Employee : " + this.getName());
		System.out.println(this.getName() + " is rated as " + this.getFeedback() );
		
	}
	
	public void processTransaction(Customer c1,Vehicle v1)
	{
		
		double netPrice = v1.getPrice() - this.getRateForUsedVeh()- discountOnBasePrice(c1,v1);
		String formattedNetPrice = IndianCurrencyFormat.format(netPrice);
		System.out.println ("Customer " + c1.getName() + " has purchased " + v1.getMake() + " Vehicle for Net Price of " + formattedNetPrice );
	}
	private double getRateForUsedVeh()
	{
		double usedVehRate = 60000;
		return usedVehRate;
	}
	
	public void processLoan(Customer c1,double loanAmount,Bank b1)
		{
		
		String formattedLoanAmt = IndianCurrencyFormat.format(loanAmount);
		System.out.println("LoanAmount " + formattedLoanAmt +  " is registered for Customer ID " + c1.getCustomerID()+" with the rate of interest of "+b1.getInterestRate());
		System.out.println("Please find the Customer details below :");
		System.out.println("Name :" + c1.getName());
		System.out.println("Age : " + c1.getAge());
		System.out.println("Gender :" + c1.getGender());
	}

	@Override
	public double  discountOnBasePrice(Customer c1,Vehicle v1) {
		double discount = 0;
		// TODO Auto-generated method stub
		if (c1.getCustomerType() == 'E' )
		{
			discount =  v1.getPrice()*0.01;
		}
			else if (c1.getCustomerType() == 'N' )
			{
				discount =  v1.getPrice()*0.05;
		}
		System.out.println("discount" + discount);
	return discount;
		
	}
	
	
	
	

}
