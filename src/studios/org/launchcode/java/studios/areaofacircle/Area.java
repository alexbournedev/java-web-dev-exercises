package studios.org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

//Area = pi * r^2

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a radius: ");
        Double radius;


        if (scan.hasNextDouble()){
            radius = scan.nextDouble();
            if (radius>0){
                System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
            } else {
                System.out.println(radius + " is not a valid number. Please enter a positive value.");
            }
        } else {
            System.out.println("Please enter a valid number!");
        }


    }
}
