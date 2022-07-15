import java.util.Scanner;
public class d6l6 {
    public static void main(String []args){
        int[] y = new int[3];
        Scanner scanner = new Scanner(System.in); 
        for (int x = 0; x < 3; x++)
        {
            System.out.println("Please Type a Number");
            String userImput = scanner.nextLine();
            int z = Integer.parseInt(userImput);
            y[x] = z;
        }
        int b = y[0];
        boolean increasing = false;
        boolean decreasing = false;
        boolean neither = false;
        for (int a = 1; a < 3; a++){
            if (y[a] > b){
                if (decreasing == true){
                    neither = true;
                    decreasing = false;
                }
                else {increasing = true;}
            }
            else if (y[a] < b){
                if (increasing == true){
                    neither = true;
                    increasing = false;
                }
                else {decreasing = true;}
            }
            else if (y[a] == b){
                neither = true;
            }
            b = y[a];
        }
        if (neither == true){
            System.out.println("Your Numbers are Neither Increasing or Decreasing");
        }
        else if (increasing == true){
            System.out.println("Your Numbers are Increasing");
        }
        else if (decreasing == true){
            System.out.println("Your Numbers are Decreasing");
        }
    }
}