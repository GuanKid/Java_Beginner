package chapter9.Exercise2.ex09_2_exercise;


import chapter9.Exercise2.Solution.ex09_2_exercise.Customer;

public class ShoppingCart {

    public static void main(String args[]) {

        // Declare, instantiate, and initialize a Customer object

        Customer cust1 = new Customer("Bob Miller", "555-44-3212");

        // Print the customer object name
        System.out.println("Customer name: "+cust1.getName());
        
    }
}
