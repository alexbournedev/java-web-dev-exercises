package exercises;

import java.util.Scanner;

public class mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("How many miles did you drive? ");
        double miles = input.nextDouble();

        System.out.print("How many gallons of gasoline did you use? ");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;

        System.out.println("You drove " + miles + " miles, and used " + gallons + " gallons of gasoline. Your MPG is " + milesPerGallon + ".");
    }
}
