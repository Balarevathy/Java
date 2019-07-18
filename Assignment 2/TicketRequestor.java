package com;

import java.util.*;

public class TicketRequestor {
	private double ticketNum;
	public double getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(double ticketNum2) {
		this.ticketNum = ticketNum2;
	}

	private String ticketDescription;
	static String ticketStatus;
	private int ticketType;
	

	private String ticketComments;
	
	public void createTicket(String ticketDesc, int ticketTyp)
	{
	    ticketNum = Math.random();
	    System.out.println("ticketNum"+ticketNum);
	    	
		ticketType = ticketTyp;
		ticketStatus = "New";
		setTicketNum(ticketNum);
		setTicketDescription(ticketDesc);
	}
	
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
	
	public void closeTicket(String ticketComms)
	{	
		
		ticketStatus = "Closed";
		updateComments(ticketComms);
	}
	
	public void printTicket()
	{	
		System.out.println("Ticket Number: " + getTicketNum());
		System.out.println("Ticket Description: " + getTicketDescription());
		System.out.println("Ticket status: " + this.ticketStatus);
		System.out.println("Ticket Comments: " + getTicketComments());
	
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
	
	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	

}
