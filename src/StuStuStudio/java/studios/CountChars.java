package StuStuStudio.java.studios;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountChars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> tony = new HashMap<>();
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine();
        phrase = phrase.toLowerCase();

        for (int i=0; i < phrase.length(); i++){
            int asciiValue = phrase.charAt(i);
            if(asciiValue > 96 && asciiValue < 123) {
               if (!tony.containsKey(phrase.charAt(i))) {
                   tony.put(phrase.charAt(i), 1);
               } else {
                   tony.put(phrase.charAt(i), tony.get(phrase.charAt(i)) + 1);
               }
           }
        }

        for (Map.Entry<Character, Integer> entry : tony.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
