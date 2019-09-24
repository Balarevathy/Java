package atm1;


import java.util.ArrayList;
import java.util.Scanner;

public class CardDetailsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter card Number:");
		int atmNum =	in.nextInt();
		System.out.println("Entered card Number:"+atmNum);
		
		FileHandling obj = new FileHandling();
		ArrayList<CardDetails> cardDetails	 = obj.populateCardDetailsData();
	
	CardDetails cd = findCardDetailsFromListByCardNumber(cardDetails, atmNum);
	if (cd.getCardNumber() != atmNum)
	{
		System.out.println("Entered card Number is invalid...");
	}
	else
	{
		System.out.println("Press 1 for Balance Enquiry.");
		System.out.println("Press 2 for Withdrawal. ");
		int enteredOption =	in.nextInt();
	
	if (enteredOption == 2)
	{   
		System.out.println("Enter Withdrawal Amount : ");
		double withdrawalAmt = in.nextDouble();
		System.out.println("Withdrawal Amount " + withdrawalAmt);
	//System.out.println(cd.getCardNumber()+" "+cd.getBalance());
	obj.withdrawAmount(cd , withdrawalAmt,cardDetails);
	} 
	else if (enteredOption == 1)
	{
		//System.out.println(cd.getCardNumber()+" "+cd.getBalance());
		//obj.printCardDetails(cardDetails);
		obj.printCardDetailsByCardNum(cardDetails, atmNum);
		
	}
	}
	}
	
	public static CardDetails 	findCardDetailsFromListByCardNumber(ArrayList<CardDetails> cardList, int cardNumber)
	{
		CardDetails cd = null;
		for(int i=0;i<cardList.size();i++)
		{
		 cd=cardList.get(i);
		if (cd.getCardNumber()==cardNumber)
		{
			return cd;
			
		}
		}
		return cd;

	}


}

