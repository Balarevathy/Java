package com;

public class TicketApprover {
	private double ticketNum;
	private String ticketDescription;
	static String ticketStatus;
	private int ticketType;
	private String ticketComments;
	public void ApproveTicket(String ticketComms)
	{	
		
		ticketStatus = "Approved";
		updateComments(ticketComms);
	}
	public void cancelTicket(String ticketComms)
	{	
		
		ticketStatus = "Cancelled";
		updateComments(ticketComms);
	}
	
	public void updateComments(String ticketComms)
	{this.ticketComments = this.ticketComments + ticketComms;
	}

	public String getTicketComments() {
		return ticketComments;
	}

	public void setTicketComments(String ticketComments) {
		this.ticketComments = ticketComments;
	}
	
	public void printTicket(double ticketNum, String ticketDesc)
	{	
		System.out.println("Ticket Number: " + this.ticketNum);
		System.out.println("Ticket Description: " + ticketDesc);
		System.out.println("Ticket status: " + this.ticketStatus);
		System.out.println("Ticket Comments: " + getTicketComments());
	
	}

}
