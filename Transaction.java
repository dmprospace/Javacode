/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesproj;

import java.util.ArrayList;

import java.util.Iterator;

/**
 *
 * @author Mohnani
 */

class Transaction 
{
	private int customerID;
	private String customerName;
	public final ArrayList<LineItem> lineItems;
	private String LineItem;
   
	public Transaction (int customerID, String customerName)
	{
		this.customerID   = customerID;
		this.customerName = customerName;
		this.lineItems    = new ArrayList<>();
	}
  
	public int getcustomerID()
	{
		return customerID;
	}
	public void setcustomerID(int customerID)
	{
		this.customerID = customerID;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	
	public void setcustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public void addLineItem(String itemName, int quantity, double price)
	{
		this.lineItems.add(new LineItem(itemName, quantity, price));
	}
    
    public void updateItem(String itemName, int quantity, double price)
	{
        Iterator<LineItem> itemIterator = this.lineItems.iterator();
        while (itemIterator.hasNext()) 
		{
            LineItem item = itemIterator.next();
			if(item.itemName==itemName)
			{
				item.setQuantity(quantity);
				item.setItemName(itemName);
            }
        }		
    }
		
    public double getTotalPrice()
	{
        double totalPrice = 0;
         
        for (int i =0;i<lineItems.size(); i++)
		{
			LineItem item = lineItems.get(i);
			totalPrice = totalPrice + item.getTotalPrice();
        }
        return totalPrice;
    
    }
    
	public String getLineItem()
	{
        return LineItem;
    }
	
	
    @Override
	public String toString() 
	{
		String tranString="Customer ID : " + this.customerID + "\nCustomer Name : " + this.customerName + "\n\n";
        for (int i =0;i<lineItems.size(); i++)
		{
			LineItem item = lineItems.get(i);
			tranString = tranString + "\n" + item.toString();
        }
		tranString = tranString + "\n" + "Transaction Total\t\t\t$"+ this.getTotalPrice();
        return tranString;		
	}
}
