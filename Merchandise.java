/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wk8proj;

/**
 * This Class implements the Merchandise in the Gift Shop
 * of the Amusement Park such as T-Shirt, Sweatshirts, & Stuffed Animals
 * @author Mohnani
 */

class Merchandise {
	long id;
	String category;   // "T-Shirt", "Sweatshirt", and "Stuffed Animal"
	String description;
	double price;
	boolean inStock ;  // false-On Ordres, true= in stock
	
	public Merchandise(String Id, String category, String description, double price, boolean inStock)
	{
		this.id=Integer.parseInt(Id);
                if(category != "T-Shirt" && category!="Sweatshirt"&& category!="Stuffed Animal")
                {
                    this.category="UNKNOWN";
                }else
                {
                    this.category=category;
                }
		this.description=description;
		this.price=price;
		this.inStock=inStock;		
	}
	public void setCategory(String category)
	{
                if(category != "T-Shirt" && category!="Sweatshirt"&& category!="Stuffed Animal")
                {
                    this.category="UNKNOWN";
                }else
                {
                    this.category=category;
                }
        }
        
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setInstock(boolean inStock) 
	{
		this.inStock=inStock;
	}
	
	public String getId()
	{
		return ""+this.id;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public String getDescription()
	{
		return this.description;
	}	
	public double getPrice()
	{
		return this.price;
	}
        

	public boolean getInstock()
	{
		return this.inStock;
	}


    @Override
	public String toString() {
		return(""+id+" "+category+" "+description+" "+" "+price+ " "+inStock);
	}
}
