/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesproj;

/**
 *
 * @author admin
 */
public class SalesProj {

    /**
     * @param args 
     * Main Function to demonstrate Transaction Class
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transaction t= new Transaction(12345,"John Doe");
        t.addLineItem("Colgate Toothpaste" , 2, 2.99);
        t.addLineItem("Bounty Paper Towels" , 1, 1.49);		
        t.addLineItem("Kleenex Tissue     " , 1, 2.49);
        System.out.println(t.toString());
    }
}
