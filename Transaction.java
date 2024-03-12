import java.util.ArrayList;


public class Transaction {
   public final ArrayList<LineItem> lineItems;
   private int customerID;
   private String customerName;
    private String LineItem;
    private int i;
   
   public Transaction (int customerID, String customerName){
       this.customerID = customerID;
       this.customerName = customerName;
       this.lineItems = new ArrayList<>();
   }
  
   
           
    public int getcustomerID(){
        return customerID;
    }
    public void setcustomerID(int customerID){
        this.customerID = customerID;
    }
    
    public String getcustomerName(){
        return customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }
    public String addLineItem(){
       lineItems.add(new LineItem("Colgate Toothpaste", 2,2.99));
        lineItems.add(new LineItem("Bounty Paper Towels", 1, 1.49));
        lineItems.add(new LineItem("Kleenex Tissue", 1, 2.49));
        //System.out.println(lineItems);
        return ("colgate not found");
    }
    
     
    
    public String updateItem()
{
     
       return null;
        
    }
    public double getTotalPrice(){
        double totalPrice = 0;
         
        for (int i =0;i<lineItems.size(); i++){
        LineItem item = lineItems.get(i);
        totalPrice = totalPrice + item.getTotalPrice();
        }
        return totalPrice;
    
    }
    public String getLineItem(){
        return LineItem;
    }
   @Override

public String toString() 
{
return ("Customer ID:" + this.customerID + "\n" + "Customer Name" + this.customerName );
}

}
