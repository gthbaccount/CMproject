import java.util.ArrayList;
import java.util.Scanner;

public class calculator {

    public static double addition(ArrayList<Double> a){
        double output = 0;
        for(int varname = 0; varname < a.size(); varname++){
            output += a.get(varname);
            
        }
        return output;
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put in a number and press 'enter'");
    

    }
}
