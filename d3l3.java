import java.util.Scanner;
public class d3l3{
    public static void main(String []args)
    {
    //     Scanner scanner = new Scanner(System.in); // Create a scanner object

    //     System.out.println("what is your favorite food?");

    //     String Favfood = scanner.nextLine();

    //     System.out.println("what is your name?");

    //     String name = scanner.nextLine();

    //     System.out.println("hello " + name + ", your favorite food is " + Favfood);
        
        // int coaster1 = 1;
        // int coaster2 = 0;
        // int coaster3 = 1;
        
        // if (coaster1 == 1)
        // {
        //     System.out.println("its open!");
        // }
        // else if (coaster2 == 1)
        // {1
        //     System.out.println("its open!");
        // }
        // else if (coaster3 == 1)
        // {
        //     System.out.println("its open!");
        // }
        // else
        // {
        //     System.out.println("its not open.");

        int age = 17;
        int num = 300;
        String word = "bulbous";
        boolean oven = false;

        if (age > 15)
        {
            System.out.println("you can apply for a drivers liscense");
        }
        else
        {
            System.out.println("Wait until you're at least 15 to apply");
        }

        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is not even");
        }
        if (word.length() < 5)
        {
            System.out.println("your word is short");
        }
        else
        {
            System.out.println("your word is long");
        }
        if (oven == false)
        {
            System.out.println("you oven is off");
        }
        else
        {
            System.out.println("your oven is on");
        }

    }
}