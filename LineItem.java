/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesproj;

/**
 *
 * @author Mohnani
 */

class LineItem 
{
    String itemName;
    int quantity;
    double price;
	
    // Constructor (three parameters = item, qty, unit price)
    public LineItem(String itemName, int quantity, double price) 
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price    = price   ;
    }

    //Accessor methods / Getter methods
    //Get Name
    public String getName()
    {
        return this.itemName;
    }

    //Get Quantity
    public int getQuantity()
    {
        return this.quantity;
    }

    //Get Price
    public double getPrice()
    {
        return this.price;
    }
	
    //Convert Quantity & unit price into total
    public double getTotalPrice()
    {
        return this.quantity * this.price;
    }

    // Mutator methods / Setter methods
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // Set Price
    public void setPrice(double price)
    {
        this.price = price;
    }

    // Set Item Name
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }	
     
    // Override toString method
    @Override
    public String toString()
    {
      return(this.itemName + "\tqty " + this.quantity + "  @ $" + this.price + "\t$" + this.getTotalPrice());
    } 
}
