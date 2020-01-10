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
import java.util.Iterator;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class AmusementParkTester {
    public static void main(String args[]) 
    {
        AmusementPark ap=new AmusementPark("Walden Amusement Park");
        while(true)
        {    
            Scanner myscan = new Scanner(System.in);
            System.out.println("Enter a Choice:");
            System.out.println("0: getTicketDates");
            System.out.println("1: getTickets for a Date");
            System.out.println("2: getTicket for an Id");
            System.out.println("3: get all Merchandise");
            System.out.println("4: get Merchandise for an id");            
            System.out.println("5: get Merchandise for a category");            
            System.out.println("6: add a new Ticket to the inventory of the AmusementPark");            
            System.out.println("7: add a new Merchandise to the inventory of the AmusementPark");            
            System.out.println("8: buy Merchandise");            
            System.out.println("9: buy Ticket"); 
            System.out.println("X: Exit"); 
            System.out.println("Your Input please --->  "); 
            
            String s=myscan.nextLine();
            if (s.equals("X") || s.equals("x"))
            {
                System.out.println("Received X");
                System.out.println("Thanks! Exiting");
                System.exit(0);
            }
            else if(s.equals("0"))
            {
                ArrayList<LocalDate> dl=new ArrayList<LocalDate>();
                System.out.println("Calling getTicketDates");
                dl=ap.getTicketDates();
                for(int i=0;i<dl.size();i++)
                {
                    System.out.println(dl.get(i));
                }
            }
            else if(s.equals("1"))
            {
                System.out.println("You chose (1) getTickets for a Date");
                System.out.println("Enter Date as YYYY-MM-DD ->");
                String ss=myscan.nextLine();
                int i = ap.getTickets(LocalDate.parse(ss));
                System.out.println("Available Tickets for Date "+ss+ " are : "+String.valueOf(i)); 
            }
            else if(s.equals("2"))
            {
                // Get Ticket for an Id
                System.out.println("You chose (2) get Ticket for an Id");
                System.out.println("Enter Id of Ticket -> ");
                String ss=myscan.nextLine();
                Ticket i = ap.getTicket(Integer.parseInt(ss));
                System.out.println("Ticket for id "+ss+ " is : "+i.toString());             
            }
            else if(s.equals("3"))
            {
      		ArrayList<Merchandise> mlnew=new ArrayList<Merchandise>();
                mlnew=ap.getMerchandise();
                for (int i=0;i<mlnew.size();i++)
                {
                    System.out.println(mlnew.get(i).toString());
                }
            }
            else if(s.equals("4"))
            {
                // Get Merchandise for an Id
                System.out.println("You chose (4) get merchandise for an Id");
                System.out.println("Enter Id of Merchandise -> ");
                String ss=myscan.nextLine();
                Merchandise i = ap.getMerchandise(Integer.parseInt(ss));
                System.out.println("Merchandise for id "+ss+ " is : "+i.toString());                     
            }
            else if(s.equals("5"))
            {
                //get Merchandise for a category
                System.out.println("You chose (5) get merchandises for a category");
                System.out.println("Enter category of Merchandise -> ");
                String ss=myscan.nextLine();
      		ArrayList<Merchandise> mlnew=new ArrayList<Merchandise>();
                mlnew=ap.getMerchandise(ss);
                for (int i=0;i<mlnew.size();i++)
                {
                    System.out.println(mlnew.get(i).toString());
                }
            }
            else if(s.equals("6"))
            {
                System.out.println("Add a new Ticket to the inventory of the AmusementPark");

                System.out.println("Enter category (adult, child, senior)-> ");
                String category=myscan.nextLine();

                System.out.println("Enter Holder's Name-> ");
                String holder=myscan.nextLine();

                System.out.println("Enter Date in format YYYY-MM-DD -> ");
                LocalDate date=LocalDate.parse(myscan.nextLine());

                System.out.println("Enter Price -> ");
                double price=myscan.nextDouble();

                System.out.println("Enter Purchase Status (true=purchased / false=reserved -> ");
                boolean purchaseStatus=myscan.nextBoolean();
		
                Ticket t=new Ticket(ap.getMaxTicketId()+1,category,holder,date,price,purchaseStatus);
                ap.tickets.add(t);
            }
            else if(s.equals("7"))
            {
                System.out.println("Add a new Merchandise to the inventory of the AmusementPark");

                System.out.println("Enter category (T-Shirt, Sweatshirt, Stuffed Animal)-> ");
                String category=myscan.nextLine();

                System.out.println("Enter Description-> ");
                String description=myscan.nextLine();

                System.out.println("Enter Price -> ");
                double price=myscan.nextDouble();

                System.out.println("Enter In-Stock Status (true=In Stock / false=On Order-> ");
                boolean inStock=myscan.nextBoolean();
		
                Merchandise m=new Merchandise(""+ap.getMaxMerchandiseId()+1,category,description,price,inStock);
                ap.merchandises.add(m);                
            }
            else if(s.equals("8"))
            {
               System.out.println("Enter Merchandise ID to Buy -> ");
               String str="";
               int maxid;
               long i=myscan.nextLong();
               ap.buyMerchandise(String.valueOf(i));
            }
            else if(s.equals("9"))
            {
               System.out.println("Enter Ticket ID to Buy -> ");
               long i=myscan.nextLong();
               ap.buyTicket(String.valueOf(i));                
            }
        }
    }
}