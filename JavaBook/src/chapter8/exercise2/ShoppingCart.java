
package chapter8.exercise2;
//3. Call the 3-arg setItemFields method and then call item1.displayItem()
//4. Call the 4-arg setItemFields method, checking the return value.
//If the return value < 0, print an invalid color code message,
//otherwise call displayItem.

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.

//        item1.setItemFields("Book",3,9.99);
//        item1.displayItem();

        int returnValue = item1.setItemFields("Book",3,9.99,' ');

        if (returnValue < 0) {
            System.out.println("Invalid color Code");

        }
        else {
            item1.displayItem();
        }
	// Test your code for both valid and invalid values

//        System.out.println(item1.setItemFields("Ball",3,9.99,' '));
//        System.out.println(item1.setItemFields("Ball",3,9.99,'B'));
        
    }
}
