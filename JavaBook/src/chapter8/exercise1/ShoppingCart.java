package chapter8.exercise1;
//In the ShoppingCart class:
//        2. Call the setColor method on item1.  If it returns true,
//print out item1.color.  If it returns false, print an
//invalid color message.
//3. Test the method with both a valid color and an invalid one.

public class ShoppingCart {
    public static void main(String[] args) {

        Item item1 = new Item();

        char colorCode = 'Y';



        if (item1.setColor(colorCode)== false){
            System.out.println("invalid color code");
        }
        else
        {
            System.out.println("Your color code is "+item1.colorCode);
        }



    }
}
