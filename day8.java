import java.util.Scanner;
public class day8 {

    public static int multiply(int a, int b){
        int result = a * b;
        return result;
    }

    public static String ifPerfSq(int num)
    {
        int n = Math.abs(num);
        double sq = Math.sqrt(n);

        if ((sq * sq) == n)
        {
            return "Elite ";
        }
        return "";
    }

    // public static boolean isOdd(int a){
    //     if(a % 2 == 0){
    //         return false;
    //     }
    //    	else{
    //         return true;
    //     }
    // }
    public static void main(String []args)
    {
        // hw review - l4 proj
        // project: number sorter -- proj4
        // user inputs as many numbers as they want --> scanner, while loop
        // check if number is even, odd, positive, or negative... or zero
        // add prefixes & suffixes to the numbers
        // for promotions, check is absolute value is a perfect square, then add a star
        // Scanner scanner = new Scanner(System.in);

        while (true){
            String userInput = scanner.nextLine();

            ifPerfSq(num);

            if (even number)
            {
                if (numb > 0)
                {
                    // its positive
                }
                else{
                    // its neg
                }
            }
            else if (odd number)
            {

            }
            
        }



        // // methods / functions
        // // pros: allow us to reuse and simplify code
        //     // important for interacting with objects
        //     // can test the program one section at a time
        
        // // we've been using methods already
        // // they take some kind of input and return something
        // if(String1.equals(String2)){ 
            
        //     // some code here
        
        // }

        // import java.util.Random;
        // Random rand = new Random();

        // // Obtain a number between [0 - 49].
        // int n = rand.nextInt(50);

        // when creating methods, start with public static
        // followed by return type (like int or String or void)
        // name of method
        // then the parameters

        System.out.println(multiply(2,1));

        if (multiply(2,1) == 2)
        {
            System.out.println("It's 2!");
        }


        // System.out.println(isOdd(5));


        // returns and parameters
        // what are the returns, and what would be the parameters?


        // I ask you to add two numbers together

        // I ask you to calculate your GPA

        // I ask if you are over 6 feet tall

        // I ask you your age

        // I ask you your name

        // I ask you to do 5 jumping jacks

        // I ask you to run a mile
    }

}
