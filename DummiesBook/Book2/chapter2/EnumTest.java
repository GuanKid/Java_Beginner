package Book2.chapter2;

public class EnumTest
{
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};

    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit);
    }
}
