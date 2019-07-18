package com;

import java.util.Scanner;

public class TicketSystemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int getInput;
		int ticketType;
		String ticketDesc;
		String role="";
		String ticketComms;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		TicketRequestor ticket = new TicketRequestor();
		TicketApprover  approve = new TicketApprover();
		System.out.println("Please enter 1 for Create new Ticket  , 3 to approve the ticket, 4 to cancel the ticket and 5 to close the ticket or 2 for exit");
		getInput = in.nextInt();
		in.nextInt();
		if ( getInput == 2 )
		{
		return;
		}
		else if (getInput == 1)
		{
			role = "Requestor";
			System.out.println("Please enter Ticket Type");
			ticketType = in.nextInt();
			System.out.println("Please enter Ticket Description");
			/*ticketDesc = in.nextLine();
			in.nextLine();*/
			ticket.createTicket("DatabaseRefresh", ticketType);	
			ticket.printTicket();
		}
		else if (getInput == 3)
		{
			role = "Approver";
			System.out.println("Please enter comments for approval if any");
			ticketComms = in.nextLine();
			ticketComms = in.nextLine();			
			if (ticketComms != "")
			{
		    approve.ApproveTicket(ticketComms);
			}
		    approve.printTicket(ticket.getTicketNum() ,ticket.getTicketDescription());
		}
		else if (getInput == 4)
		{
			
			System.out.println("Please enter comments");
			ticketComms = in.nextLine();
			ticketComms = in.nextLine();
			if (ticketComms != "")
			{
				if (role == "Approver")
				{
				approve.cancelTicket(ticketComms);
				}
				else
				{
					ticket.cancelTicket(ticketComms);
			}
			}
		if (role == "Approver")
		{
		    approve.printTicket(ticket.getTicketNum() ,ticket.getTicketDescription());
		}
		else
		{
			ticket.printTicket();
	    
		}
	}
		else if (getInput == 5)
		{
			
			System.out.println("Please enter comments");
			ticketComms = in.nextLine();
			ticketComms = in.nextLine();
			if (ticketComms != "")
			{
				ticket.closeTicket(ticketComms);
			}
			
		   ticket.printTicket();
		}
		
		}
}	
		
	


