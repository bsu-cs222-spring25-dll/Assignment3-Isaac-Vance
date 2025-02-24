package edu.bsu.cs;
import java.util.Scanner;
public class SillyMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int inputNumber = scan.nextInt();
        System.out.print("Your wacky number is: "+WackyNumberGenerator(inputNumber));

    }
    public static int WackyNumberGenerator(int startingNumber){
        return 45*(startingNumber/34);
    }
}
