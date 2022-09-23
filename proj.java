import java.util.ArrayList;
import java.util.Scanner;

public class proj {

    public static double addition(double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your second number to add.");
        double output = 0;
        String userInput = scanner.nextLine();
            output = num + Double.parseDouble(userInput);

        return output;
    }
    
    public static double subtraction(double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your second number to subtact.");
        double output = 0;
        String userInput = scanner.nextLine();
            output = num - Double.parseDouble(userInput);

        return output;
    }
    public static double multiplication(double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your second number to multiply.");
        double output = 0;
        String userInput = scanner.nextLine();
            output = num * Double.parseDouble(userInput);

        return output;
    }
    
    public static double division(double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your second number to divide.");
        double output = 0;
        String userInput = scanner.nextLine();
            output = num / Double.parseDouble(userInput);

        return output;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        try
        {
            
            String num = "";
            String prev = "";
            double output = 0;
            double answer = 0;
            String userInput = " q";
            boolean n = false;
            while(userInput.charAt(0) != 'q'){
                if(n == false){
                    System.out.println("put in your number");
                }
                else{
                    System.out.println("Add (+), Subtract (-), Multiply (*), or Divide(/)");
                }
                userInput = scanner.nextLine();
            
                //System.out.println(userInput.charAt(x));
                
                if(userInput.charAt(0) == '-'){
                    output = subtraction(answer);
                    answer = output;
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '+'){
                    output = addition(answer);
                    answer = output;
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '*'){
                    output = multiplication(answer);
                    answer = output;
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '/'){
                    output = division(answer);
                    answer = output;
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else{
                    if(userInput.charAt(0) == 'c'){
                        output = 0;
                        System.out.println("numbers cleared");
                    }
                    else if (userInput.charAt(0) == 'q')
                    {
                        System.out.println("Goodbye");
                    }
                    else{
                        answer = Double.parseDouble(userInput);
                        n = true;
                    }
                }
               
            }
        }
        finally{
            scanner.close();
        }
        
    }
}