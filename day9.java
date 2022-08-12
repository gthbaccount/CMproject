/*
This program computes the volumes of two cubes.
*/
public class day9{
    /*
    Computes the volume of a cube.
    @param sideLength the side length of the cube
    @return the volume
    */


    // What is the value of cubeVolume(2)?
    // What is the value of cubeVolume(3)?
    // What is the value of cubeVolume(cubeVolume(2)) ?
    
    public static double cubeVolume(double sideLength){
        // sidelength = 2
        double volume = sideLength * sideLength * sideLength;
        // volume = 8
        return volume;// 8
    }

    public static void printHi()
    {
        System.out.println("Hi there.");
    }


    // What is the result of the call mystery(2, 3), using the method below? 
    // Notice how this code snippet is the method only; you still need to stick it in the 
    // appropriate place and call it for the method to run correctly.
    // public static double mystery(int x, int y){
    //     double result = (x + y) / (y - x);
    //     return result;
    // }


    // create a method that adds two numbers together 
    // call it in your main function

    
    // create 2 methods

    // method 1
    // takes in 2 numbers, subtracts them
    
    // method 2 (int parameter1, int parameter2)
    // takes in 2 numbers, multiplies them together
    // in this method, call method 1, pass in the two numbers
    // passed to it, and save it's return value = subtractResult
    // use that return value & multiply that result with it's 2nd parameter
    // subtractResult * parameter2
    // return that ^


    public static int mystery(int n){
        n++;
        n++;
        return n;
    }
    public static void main(String[] args){
        int a = 5;
        System.out.println(mystery(a));
    }

    // parameters and parameter passing
    // 5-2 excersizes 
    // public static void main(String[] args){
    //     double result1 = cubeVolume(2);
    //     // cubeVolume(5.0);
    //     double result2 = cubeVolume(10);
    //     System.out.println("A cube with side length 2 has volume " + result1);
    //     System.out.println("A cube with side length 10 has volume " + result2);

    //     double result = mystery(4, 8);
    //     System.out.println("my result " + result);
    // }
}