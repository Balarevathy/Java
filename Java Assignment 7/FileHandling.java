package atm1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class FileHandling {
	
	public ArrayList<CardDetails> populateCardDetailsData()
	{
		FileReader fr = null;
		File file = null;
		BufferedReader br = null;
	ArrayList <CardDetails>  cardDetailsList = new ArrayList<>();
	try 
	{
		 
		 file = new File("c:\\users\\kbalarev\\file1.txt");
		 fr = new FileReader(file);
		br = new BufferedReader (fr);
		String line = br.readLine();
		while (line != null)
		{
			String [] data = line.split(",");
			CardDetails cd = new CardDetails();
			cd.setCardNumber(Integer.parseInt(data[0]));
			cd.setName(data[1]);
			cd.setBankName(data[2]);
			cd.setBalance(Double.parseDouble(data[3]));
			cd.setCardType(data[4]);
			cardDetailsList.add(cd);
			line = br.readLine();
		}
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e){
		e.printStackTrace();
	}

	return cardDetailsList;
		
		
	}
	
	 public void printCardDetails (ArrayList<CardDetails> cardDetailsList)
	 {
		 
		 DecimalFormat ft = new DecimalFormat("#.##"); 
		 System.out.println("CardNum\tName\tBank\tBalance\tType");
		 for(CardDetails card:cardDetailsList)
		 {
			System.out.println(card.getCardNumber()+"\t"+card.getName()+"\t"+
		 card.getBankName()+"\t"+ft.format(card.getBalance())+"\t"+card.getCardType()); 
	 }
	 }
		 
		 public void printCardDetailsByCardNum (ArrayList<CardDetails> cardDetailsList,int cardNum)
		 {
			 System.out.println("CardNum\tName\tBank\tBalance\tType");
			 DecimalFormat ft = new DecimalFormat("#.##"); 
			 for(CardDetails card:cardDetailsList)
			 {
				 if (card.getCardNumber()==cardNum)
				 {
					 System.out.println(card.getCardNumber()+"\t"+card.getName()+"\t"+
							 card.getBankName()+"\t"+ft.format(card.getBalance())+"\t"+card.getCardType()); 
					// System.out.println( String.format("%-5s %-5s ",card.getCardNumber(), card.getName())) ;
				 }
			 }
				
		 }
	 
		 
		 public  void withdrawAmount (CardDetails carddetails, double withdrawalAmt,ArrayList<CardDetails> cardDetails)
		 {
		 	FileWriter  filew = null;
		 	 BufferedWriter br = null;
		 	 Bank bank = new Bank("AXIS");
		 	System.out.println("Available Balance " + carddetails.getBalance());
		 	System.out.println("Service Charge Applied " + bank.assignServiceCharge());
		 	double balAmt = carddetails.getBalance() - withdrawalAmt-bank.assignServiceCharge();
		 	carddetails.setBalance(balAmt);
		 	
		 	try {
		 		 filew = new FileWriter ("c:\\users\\kbalarev\\file1.txt");
		 		 br = new BufferedWriter (filew);
		 		 FileHandling fh = new FileHandling();
		 		 fh.printCardDetailsByCardNum(cardDetails,carddetails.getCardNumber());
		 		 for(CardDetails card:cardDetails)
		 		 {
		 			//System.out.println("new " + card.getCardNumber()+"\t"+card.getName()+"\t"+
		 		 //card.getBankName()+"\t"+card.getBalance()+"\t"+card.getCardType()); 
		 			try
		 			{
		 			filew.write(card.getCardNumber()+","+card.getName()+","+
		 					 card.getBankName()+","+card.getBalance()+","+card.getCardType());
		 			filew.write("\r\n");
		 			}
		 			catch (Exception e )
		 			{
		 				e.printStackTrace();
		 			}
		 			}
		 	 
		 	
		 	} catch (IOException e) {
		 		// TODO Auto-generated catch block
		 		e.printStackTrace();
		 	}
		 	try {
		 		filew.close();
		 	} catch (IOException e) {
		 		// TODO Auto-generated catch block
		 		e.printStackTrace();
		 	}
		 }



	
}
