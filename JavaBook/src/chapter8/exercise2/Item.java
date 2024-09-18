package chapter8.exercise2;
//1. Write a setItemFields method that takes 3 args and assigns them
//        to desc, quantity, and price fields.  The method returns void.
//        2. Write an overloaded setItemFields method that takes 4 args and
//returns an int.  The method assigns all 4 fields.  Invalid value for
//the colorCode arg is ' ' (a single space)
//If the colorCode arg is invalid, return -1 without assigning the value.
//If the colorCode is valid, assign the colorCode field and then assign
//the remaining fields by calling the 3 arg method.
public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.

    public void setItemFields(String desc, int quantity, double price)
    {
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }


    // Write a public 4-arg setItemDisplay method that returns an int.


    public int setItemFields(String desc, int quantity, double price, char c)
    {
        if (c == ' ') {
            return -1;
        }
        else
        {
            colorCode = c;
            setItemFields(desc, quantity, price);
            return 1;
        }
    }

}