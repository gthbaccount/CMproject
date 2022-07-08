import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class d5l5{
    public static void main(String []args){
        
        
        
        // for (int i = 0; i <= 1000; i = i+20){
        //     System.out.println(i);
        // }
        
        // int i = 0;

        // while ( i <= 1000){
        //     System.out.println(i);
        //     i = i+20;
        // }

        
        // for (int i = 0; i <= 100; i++)
         {
        //     if (i % 15 == 0)
        //     {
        //         System.out.println("FizzBuzz");
        //     }
        //     else if (i % 3 == 0 ){
        //         System.out.println("Fizz");
        //     }
        //     else if (i % 5 == 0)
        //     {
        //         System.out.println("Buzz");
        //     }
        //     else
        //     {
        //         System.out.println(i);
        //     }

        Scanner var = new Scanner(System.in);
        System.out.println("Please Typer a Number.");
        int x = Integer.parseInt(var.nextLine());

        if (x == 0)
        {
            System.out.println("Your Number is 0");
        }
        else if (x < 0)
        {
            System.out.println("Your Number is a Negative Integer");
        }
        else if (x > 0)
        {
            System.out.println("Your Number is a Positive Integer");
        }

        }
    }

 }


