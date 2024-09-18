package chapter10.exercise2;

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 910.00, "VA", Order.PRIVATE);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
