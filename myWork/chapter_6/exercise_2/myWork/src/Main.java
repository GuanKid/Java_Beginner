public class Main {
    public static void main(String args[]) {
        // Declare and initialize 2 Item objects

        item Item = new item();
        item item2 = new item();

        Item.itemID = 1;
        Item.desc = "Book";
        Item.price = 23.5;
        Item.quantity = 2;


        item2.itemID = 2;
        item2.desc = "Pen";
        item2.price = 15.0;
        item2.quantity = 1;

        // Print both item descriptions and run code.

        System.out.println(Item.desc + " "+ item2.desc);

        // Assign one item to another and run it again.

        item2 = Item;

        System.out.println(Item.desc + " "+ item2.desc);

    }
}