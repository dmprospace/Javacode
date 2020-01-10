/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk8proj;

/**
 *
 * @author Mohnani
 */
import java.time.LocalDate;
import java.text.SimpleDateFormat;

class Ticket {
	//static long ticketNumber=101;
	long id;
	String category; // adult, child, senior
	String holder;
	LocalDate date;
	double price;
	boolean purchaseStatus ; //true=purchased false=reserved
	
	Ticket(long id, String category, String holder, LocalDate date, double price, boolean purchaseStatus)
	{
		//ticketNumber=ticketNumber+1;
		this.id=id;
		this.category=category;
		this.holder=holder;
		this.date=date;
		this.price=price;
		this.purchaseStatus=purchaseStatus;		
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void changePurchaseStatus(boolean purchaseStatus) 
	{
		this.purchaseStatus=purchaseStatus;
	}
	
	public long getid()
	{
		return this.id;
	}
	
	public String getCategory()
	{
		return this.category;
	}

	public String getHolder()
	{
		return this.holder;
	}

	public String getDate()
	{
		//SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
		String dateString = ""+this.date;		
		return (dateString);
	}

	public double getPrice()
	{
		return this.price;
	}

    @Override
	public String toString() {
		return(""+id+" "+category+" "+holder+" "+getDate()+" "+price+ " "+purchaseStatus);
	}
}
