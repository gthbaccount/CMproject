import java.util.ArrayList;
import java.util.Scanner;

public class d11l11 {

    public static double addition(ArrayList<Double> a){
        double output = 0;
        for(int varname = 0; varname < a.size(); varname++){
            output += a.get(varname);
            
        }
        return output;
        //amogus
    }
    public static double subtraction(String num1, String num2){
        double output = 0;
        output = Double.parseDouble(num1) - Double.parseDouble(num2);
        return output;
    }
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Put in your equation.");
            String userInput = scanner.nextLine();
            String num = "";
            String prev = "";
            double output = 0;
            for(int x = 0; x < userInput.length(); x++){
                //System.out.println(userInput.charAt(x));
                int count = 1;
                String math = "";
                if(userInput.charAt(x) == '-'){
                    System.out.println(prev);
                    while(userInput.charAt(x+ count) != '-' ||
                    userInput.charAt(x+ count) != '+' ||
                    userInput.charAt(x+ count) != '/' ||
                    userInput.charAt(x+ count) != '*'){
                        math += userInput.charAt(x+count);
                        count++;
                        if(x + count >= userInput.length()){
                            break;
                        }
                      }
                      output = subtraction(prev, math);
                      x += count;
                      prev = "";
                      System.out.print(output);
                }
                else if(userInput.charAt(x) == '+'){
                    prev = "";
                }
                else if(userInput.charAt(x) == '/'){
                    prev = "";
                }
                else if(userInput.charAt(x) == '*'){
                    prev = "";
                }
                else{
                    if(num == ""){
                        num = Character.toString(userInput.charAt(x));
                        prev = Character.toString(userInput.charAt(x));
                    }
                    else{
                        num = Character.toString(userInput.charAt(x));
                        prev = prev + num;
                    }
                   
                }
               
            }
        }
        finally{
            scanner.close();
        }
        
    }
}