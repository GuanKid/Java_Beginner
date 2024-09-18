package chapter13.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};


        ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
        for (String s : dayList){
            if (s.equals("sunday")){
                System.out.println(s.toUpperCase());
            }
            else System.out.println(s);
        }
        System.out.println(dayList);

    }
}
