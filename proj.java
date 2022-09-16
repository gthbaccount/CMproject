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
        System.out.println("Put in your second number to add.");
        double output = 0;
        String userInput = scanner.nextLine();
            output = num * Double.parseDouble(userInput);

        return output;
    }
    
    public static double division(double num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your second number to subtact.");
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
            String userInput = "";
            boolean n = false;
            while(userInput != "q"){
                if(n == false){
                    System.out.println("put in your number");
                }
                else{
                    System.out.println("Add (+), Subtract (-), Multiply (*), or Divide(/)");
                }
                userInput = scanner.nextLine();
            
                //System.out.println(userInput.charAt(x));
                int count = 1;
                String math = "";
                if(userInput.charAt(0) == '-'){
                    output = subtraction(output);
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '+'){
                    output = addition(output);
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '*'){
                    output = multiplication(output);
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else if(userInput.charAt(0) == '/'){
                    output = division(output);
                    System.out.println("New Num: " + output);
                    n = false;
                }
                else{
                    output = Double.parseDouble(userInput);
                    n = true;
                }
               
            }
        }
        finally{
            scanner.close();
        }
        
    }
}