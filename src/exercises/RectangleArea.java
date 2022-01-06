package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = input.nextInt();

        System.out.print("Enter width of rectangle: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("The area of your rectangle is " + area);
    }
}
