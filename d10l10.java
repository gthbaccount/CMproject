import java.util.Scanner;
public class d10l10 {

    // public static int m2(int num3, int num4){
    //     int output = num3 * num4;
    //     return output;
    // }

    // public static int m1(int num1, int num2){
    //     int a = m2(num1, num2);
    //     int output = a * num2;
    //     return output;
        
    // }
    // public static void main(String[] args){
    //     System.out.println(m1(3, 5));

    // }

    public static double km2mi(double kilometer){
        double output = kilometer * .62;
        return output;
    }
    
     
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Kilometers do you want to convert to Miles?");
        String userimput = scanner.nextLine();

        double a = km2mi(Double.parseDouble(userimput));
        System.out.println(a);
    }
}
