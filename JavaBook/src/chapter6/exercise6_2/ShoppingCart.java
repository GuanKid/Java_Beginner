package chapter6.exercise6_2;

public class ShoppingCart {
        public static void main(String args[]) {
            // Declare and initialize 2 Item objects

            Item item1 = new Item();
            Item item2 = new Item();

            item1.id = 1;
            item1.desc = "Book";
            item1.price = 23.5;
            item1.quantity = 2;


            item2.id = 2;
            item2.desc = "Pen";
            item2.price = 15.0;
            item2.quantity = 1;

            // Print both item descriptions and run code.

            System.out.println("Item 1: "+item1.desc + "  Item 2: "+ item2.desc);

            // Assign one item to another and run it again.

            item2 = item1;

            System.out.println("Item 1: "+item1.desc + "  Item 2: "+ item2.desc);

        }
    }

