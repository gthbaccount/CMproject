import java.lang.Math;
import java.util.Scanner;

import org.w3c.dom.events.Event;
public class d8l8{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        
        //x = even
        //y = odd
        //z = positive
        //v = negative
        String x = "Arcing";
        String y = "Molten";
        String z = "Ender";
        String v = "Dissolver";
        String b = "Elite ";
        while (true){
            String userInput = scanner.nextLine();
            int num = Integer.parseInt(userInput);
                int n = Math.abs(num);
                int sr = (int)Math.sqrt(n);
                if ((sr*sr) == n){
                    System.out.print(b);
                }
            if(num % 2 == 0){
                if(num < 0){
                    System.out.print(y + " " + num + " ");
                }
                else if(num > 0){
                    System.out.print(x + " " + num + " ");
                }
                System.out.println(v);
            }
            else if(num % 2 == 1 ||num % 2 == -1){
                if(num < 0){
                    System.out.print(y + " " + num + " ");
                }
                else if(num > 0){
                    System.out.print(x + " " + num + " ");
                }
                System.out.println(z);
            }
        }
    }
}
