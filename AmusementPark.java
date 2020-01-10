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

import java.util.ArrayList;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

// It keeps track of tickets and gift Shop Inventory
public class AmusementPark 
{
	ArrayList<Ticket> tickets=new ArrayList<Ticket>();;
	ArrayList<Merchandise> merchandises=new ArrayList<Merchandise>();
	String name; // Name of the Amusement Park or bookstore
		        

	AmusementPark(String name)
	{
            this.name=name;
            this.merchandises.add(new Merchandise("1001","T-Shirt","",10.25,true));
            this.merchandises.add(new Merchandise("1002","T-Shirt","",15.25,true));
            this.merchandises.add(new Merchandise("1003","Sweatshirt","",30.25,true));
            this.merchandises.add(new Merchandise("1004","Sweatshirt","",50.25,true));
            this.merchandises.add(new Merchandise("1005","Stuffed Animal","",25.25,true));
            this.merchandises.add(new Merchandise("1006","Stuffed Animal","",35.25,true));
            
            this.tickets.add(new Ticket(1,"adult","A. John",LocalDate.parse("2019-12-01"),10.25,true));
            this.tickets.add(new Ticket(2,"adult","B. John",LocalDate.parse("2019-12-01"),10.25,false));

            this.tickets.add(new Ticket(3,"child","C. John",LocalDate.parse("2019-12-02"),5.25,true));
            this.tickets.add(new Ticket(4,"child","D. John",LocalDate.parse("2019-12-02"),5.25,false));

            this.tickets.add(new Ticket(5,"senior","E. John",LocalDate.parse("2019-12-03"),3.25,false));
            this.tickets.add(new Ticket(6,"senior","F. John",LocalDate.parse("2019-12-03"),3.25,false));
        }
	
	String getName() 
	{
		// Returns name of the Bookstore
		return this.name;
	}
	ArrayList<LocalDate> getTicketDates()
	{
             //Returns Arraylist of All the Dates for which tickets are still available
	     // If no Tickets are available, an empty list is returned
             ArrayList<Ticket> tl=new ArrayList<Ticket>();
             tl=this.tickets;
             ArrayList<LocalDate> dl=new ArrayList<LocalDate>();
	     for (int i =0;i<tl.size(); i++)
	     {
                    Ticket t= tl.get(i);
                    if(t.purchaseStatus == false && dl.contains(t.date)==false ) 
                    {
                        dl.add(t.date);
                    }
	     }	 
		 return dl;
	}
	int getTickets(LocalDate date) 
	{
		System.out.println("getTickets with Date Called");
                // returns an Integer indicating the number of Tickets available for the specified Date
		ArrayList<Ticket> tl=new ArrayList<Ticket>();
		tl=this.tickets;
	        //ArrayList<LocalDate> dl=new ArrayList<LocalDate>();
		//int [] il =new int[tl.size()];
                int c=0;
		for (int i =0;i<tl.size(); i++)
                {
                    Ticket t= tl.get(i);
                    if(t.purchaseStatus == false && t.date.compareTo(date)==0)
                    {
                        c=c+1;
                        System.out.println(c);
                    }
                }		 
                return c;
	}
	Ticket getTicket(long id)
	{
                System.out.println("Called get Ticket for an Id = " +""+id);
		ArrayList<Ticket> tl=new ArrayList<Ticket>();
                tl=this.tickets;
		//Returns the Ticket that matches the specified id
		// If there is no Ticket matching the id null is returned
		Ticket t = null;                 
                for (int i =0;i<tl.size(); i++)
                {
                    t= tl.get(i);
                    if(t.id == id ) 
                    {
                        return t;
                    }
                }	 
                return null;                 
	}
	ArrayList<Merchandise> getMerchandise()
	{
		/*returns an ArrayList<Merchandise> of all the inventory 
		 * (in-stock and ordered). This method must create a separate copy 
		 * of the ArrayList before it returns the list. 
		 * If there are no merchandise items in the AmusementPark, 
		 * an empty list is returned.	
		 */
		ArrayList<Merchandise> mlnew=new ArrayList<Merchandise>();
                //mlnew=null;
                for (int i =0;i<this.merchandises.size(); i++)
                {
                    mlnew.add(this.merchandises.get(i));
                }	                  
		 return mlnew;
	}
	ArrayList<Merchandise> getMerchandise(String category)
	{
	    /*returns a list of Merchandise objects whose category matches the specified category. 
            * For example, if called with "T-shirt" the method returns all Merchandise objects with the category 
            * "T-shirt" as a new list. This method must create a new copy of an ArrayList that 
            * stores all the matched Merchandise objects. If no items in the AmusementPark 
            * match the given name, an empty list is returned.		 
            */
             ArrayList<Merchandise> ml=new ArrayList<Merchandise>();
             Merchandise m=null;
             for (int i =0;i<this.merchandises.size(); i++)
	     {
                    m= this.merchandises.get(i);
                    if(m.category.equals(category) ) 
                    {
                         ml.add(m);
                    }
	     }
             return ml;
	}
	Merchandise getMerchandise(long id)
	{
            /*returns the merchandise item that matches the specified id. If there is no 
            * merchandise item matching the given id, null is returned.
            */
             ArrayList<Merchandise> ml=new ArrayList<Merchandise>();
             ml=this.merchandises;
             Merchandise m=null;
             for (int i =0;i<ml.size(); i++)
	     {
                    m= ml.get(i);
                    if(m.id == id ) 
                    {
                        return m;
                    }
	     }	 
             return m;
	}
	void addTicket(Ticket t) 
	{
            //adds a new Ticket to the inventory of the AmusementPark.
            this.tickets.add(t);
	}
	void addMerchandise(Merchandise m) 
	{
            //adds a new Merchandise to the inventory of the AmusementPark.
            this.merchandises.add(m);
	}
	void buyMerchandise(String id) 
	{
            //removes a Merchandise object from the list of merchandise of the AmusementPark. 
            //If the id does not match any Merchandise object in the list, an exception is thrown
             long mid=Integer.parseInt(id);
             Merchandise m = null;
             for (int i =0;i<this.merchandises.size(); i++)
             {
                    m= this.merchandises.get(i);
                    if(m.id == mid)
                    {
                        this.merchandises.remove(m);
                        return ;
                    }
             }
             assert m!=null;
	}
	void buyTicket(String id) 
	{
            //removes a Ticket object from the list of ticket items of the AmusementPark. 
            //If the id does not match any Ticket object in the list, an exception is thrown.
            long tid=Integer.parseInt(id);
            Ticket t = null;
            for (int i =0;i<this.tickets.size(); i++)
            {
                t= this.tickets.get(i);
                if(t.id == tid)
                {
                    this.tickets.remove(t);
                    return ;
                }
            }
            assert t !=null : " Ticket Id Not Found";
	}
	long getMaxTicketId()
	{
                long maxid=0;
                for (int i =0;i<this.tickets.size(); i++)
                {
                    long j= this.tickets.get(i).id;
                    if(maxid < j ) 
                    {
                        maxid= j;
                    }
                }	 
                return maxid;         
	}
	long getMaxMerchandiseId()
	{
                long maxid=0;
                for (int i =0;i<this.merchandises.size(); i++)
                {
                    long j= this.merchandises.get(i).id;
                    if(maxid < j ) 
                    {
                        maxid= j;
                    }
                }	 
                return maxid;         
	}        
}
