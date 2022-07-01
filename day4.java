import java.util.Scanner; 

public class day4 {
    public static void main(String []args)
    {
        Scanner scanner = new Scanner(System.in);
        




        String userInput = scanner.nextLine();


        // homework review


        String horror = "horror";
        String rpg = "rpg";
        String fps = "fps";
        String single = "single player";




        int student1 = 67;
        int student2 = 80;
        int student3 = 95;


        if (student1 >= 50)
        {
            System.out.println("you got a D");
        }
        else if (student1 >= 70)
        {
            System.out.println("you got a C");
        }
        else if (student1 >= 80)
        {
            System.out.println("you got a B");
        }
        else
        {
            System.out.println("you got an A");
        }


        if (student1 >= 90)
        {
            System.out.println("you got a A");
        }
        else if (student1 >=80)
        {
            System.out.println("you got a B");
        }
        else if (student1 >= 70)
        {
            System.out.println("you got a C");
        }
        else
        {
            System.out.println("you got an D");
        }


        // While loops are like if statements that keep repeating while the statement is true.

        int counter = 0;

        while (counter <= 5)
        {
            System.out.println(counter);
            counter++;
        }


        // // For loops are loops that are based off of counters. Start, ends, and stops can be anything if it makes sense.


        // // this for loop starts at 0, ends at i < 10 (which is 9), and steps up by 1

        counter = 0;
        for(int i = 0; i <= 100; i++)
        {
            counter += i;
        }
        System.out.println(counter);

        // for(int i = 10; i > 0; i--)
        // {

        //     System.out.println("Loop: " + i); 
        // }

        // int i = 0; // this is the above for loop translated into a while loop
        // while (i < 10)
        // {
        //     System.out.println(i);
        //     i = i + 2;
        // }



        // // find the sum of 1 + 2 + 3 + 4 +... + 99 + 100

        // // here is the brute force, simplest, good enough answer
        // int sum = 0;
        // sum += 1;
        // sum += 2;
        // sum += 3;
        // // ...
        // // all the way up until...
        // // ...
        // sum += 99;
        // sum += 100;

        // // sure this will give us the answer, but obviously this is really inefficient
        // // we'd need to write 100 lines of code!!
        // // here is a better solution
        // // keep in mind, the int x we declare in the for loop is the SAME x that we add to sum

        // int sum = 0;
        // for(int x = 1; x < 101; x++){
        //     sum += x;
        // }

        // // can you solve this using a while loop?


        // // 3-2 exercises
    }
}
