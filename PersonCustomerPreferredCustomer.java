import java.util.Scanner;

class Person
{
        private String name;
        private String address;
        private String number;

        public Person(String name, String address, String number)
        {
            this.name = name;
            this.address = address;
            this.number = number;
        }
           public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getAddress(){
            return this.address;
        }
        public void setAddress(String address){
            this.address = address;
        }
        
        public String getNumber()
        {
            return this.number;
        }
        public void setNumber(String number){
            this.number = number;
        }
}


class Customer extends Person
{
         private String custNumber;
         private boolean wants;
         public Customer(String name, String address, String number, String  custNumber, boolean wants){
          super(name, address, number);
          this.custNumber = custNumber;
          this.wants = wants;
         }

         public String getcustNumber(){
            return custNumber;
         }

         public boolean isWants(){
            return wants;
         }
         
         public void setWants(boolean wants){
           this.wants = wants;
         }


}

class PreferredCustomer extends Customer
{
    int PurchaseAmount, Discount;
    public PreferredCustomer(String name, String address, String number, String  custNumber, boolean wants, int PurchaseAmount1)
    {
        super(name, address, number,custNumber,wants);
        this.PurchaseAmount = PurchaseAmount1;
        if(PurchaseAmount1 >=2000)
        {
            this.Discount=0.1;
        }
        else if(PurchaseAmount1 >=1500)
        {
            this.Discount=0.07;
        }
        else if(PurchaseAmount1 >=1000)
        {
            this.Discount=0.06;
        }
        else if(PurchaseAmount1 >=500)
        {
            this.Discount=0.05;
        }
    }
        
    public String getPurchaseAmount()
    {
        return this.PurchaseAmount;
    }
    
    public void setPurchaseAmount(int PurchaseAmount1){
        this.PurchaseAmount = PurchaseAmount1;        
    }    
        
    public String getDiscount()
    {
        return this.Discount;
    }
    
    public void setDiscount(void)
    {
        if(this.PurchaseAmount >=2000)
        {
            this.Discount=0.1;
        }
        else if(this.PurchaseAmount >=1500)
        {
            this.Discount=0.07;
        }
        else if(this.PurchaseAmount >=1000)
        {
            this.Discount=0.06;
        }
        else if(this.PurchaseAmount >=500)
        {
            this.Discount=0.05;
        }    
    }
}

class PersonCustomerPreferredCustomer {


               public static void main(String args[])
               {

                String name, address, custNumber,number;
                String decide;
                boolean wants;
                float AmountPurchased;
                int PercentOff;

                
                  Scanner keyboard = new Scanner(System.in);
                   System.out.print("Enter name of customer:");
                name = keyboard.nextLine();
                   System.out.print("Enter address of customer:");
                address = keyboard.nextLine();
                   System.out.print("Enter phone number of customer:");
                   number = keyboard.nextLine();
                System.out.print("Enter customer number:");
                   custNumber = keyboard.nextLine();
                   
                   System.out.print("Enter true/false -- does the customer want to recieve mail?:");
                   decide = keyboard.nextLine();
                wants = decide.equals("true");

                   System.out.print("Amount Purchased:");
                   AmountPurchased = keyboard.float();
                System.out.print("Percent off:");
                   PercentOff = keyboard.nextLine();

                keyboard.close();

                Customer one = new Customer(name, address, number, custNumber, wants); // creates new Customer Object.
                System.out.println("\nCustomer: ");
                System.out.println("Name: " + one.getName());
                System.out.println("Address: " + one.getAddress());
                System.out.println("Phone Number: " + one.getNumber());
                System.out.println("Customer Number: " + one.getcustNumber());
                System.out.println("Recieve Mail?: " + one.isWants());

           }

         

    }