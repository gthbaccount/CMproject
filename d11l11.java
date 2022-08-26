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
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in your equation.");
        String userInput = scanner.nextLine();
        for(int x = 0; x < userInput.length(); x++){
            System.out.println(userInput.charAt(x));

            if(Character.toString(userInput.charAt(x)) == "-"){

            }
            else if(Character.toString(userInput.charAt(x)) == "+"){

            }
            else if(Character.toString(userInput.charAt(x)) == "/"){

            }
            else if(Character.toString(userInput.charAt(x)) == "*"){

            }
            else{

            }
           
        }
        
    }
}