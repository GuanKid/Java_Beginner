public class Main {
    public static void main(String[] args) {

        double price = 22.99;
        double tax = 1.14;
        int quantity = 3;

        double total;
        String custName ="Sire", itemDesc = "Books";
        String message;


        message = custName + " wants to purchase " + quantity + " " +itemDesc;
        System.out.println(message);

        total = price * quantity * tax;
        System.out.println("Total cost with tax is: R" + total);
    }
}