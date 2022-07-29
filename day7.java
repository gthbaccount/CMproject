public class day7 {
    public static void main(String []args)
    {
        // for loops are like while loops, but you'd want to use a for loop when you know a task requires to run 
        // certain amount of times

        // step forward

        for (int i = 0; i < 5; i++)
        {
            // stepping forward here! bc of i++
        }

        // step backward
        for (int i = 10; i > 5; i--)
        {
            // this is stepping backwards!
        }

        // nested for loops
        // printing a table! 6 rows and 3 columns
        for (int i = 0; i < 6; i++)
        {
            for(int x = 0; x < 3; x++)
            {
                System.out.print("x");
            }
            System.out.println("");
        }


        // 10 rows, 5 columns


        // x rows y cols

        // exercises

        // write a program that finds the average of numbers in the range 333, 378 inclusive


        
        // use a while loop that prints out all the powers of 2 up to 500

        

        // print out the following pattering using loops
        // []
        // [][]
        // [][][]
        // [][][][]

        // project: number sorter -- proj4
        // user inputs as many numbers as they want --> scanner, while loop
        // check if number is even, odd, positive, or negative... or zero
        // add prefixes & suffixes to the numbers
        // for promotions, check is absolute value is a perfect square, then add a star
    }
}
