public class Main {
    public static void main(String[] args) {
        boolean outOfStock = false;
        double price = 22.99;
        double tax = 1.14;
        int quantity = 3;
        double total;
        String[] items = {"Shirt","Cap", "Belt", "Jeans"};
        String custName ="Sire", itemDesc = "Book";
        String message;

//        if (outOfStock == true) {
//
//            System.out.println("Item is unavailable");
//        } else {
//
//            if (quantity > 1) {
//
//                itemDesc = itemDesc + "s";
//            }
//
//            message = custName + " wants to purchase " + quantity + " " + itemDesc;
//            System.out.println(message);
//            total = price * quantity * tax;
//            System.out.println("Total cost with tax is: R" + total);
//        }

        message = "Customer wants to purchase " + items.length + " " + items[0] + "s";
        System.out.println(message);

        System.out.println("Items purchased:");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        // if I use the index value 4 it throws an ArrayIndexOutOfBoundsException error
    }
}