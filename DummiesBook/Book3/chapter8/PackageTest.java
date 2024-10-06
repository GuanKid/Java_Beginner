package Book_3.Chapter_8;

import com.gmail.markdrinkwater.util.Console;

public class PackageTest
{
    public static void main(String[] args)
    {
        while (Console.askYorN("Keep going?"))
        {
            System.out.println("D'oh!");
        }
    }
}
