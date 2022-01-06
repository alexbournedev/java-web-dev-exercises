package exercises;

import java.util.Locale;
import java.util.Scanner;

public class alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " " +
                "nothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, \"and what is the use of a book,\" though Alice \"without pictures " +
                "or conversation?\"";

        String lowercaseSentence = sentence.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a search term: ");
        String search = input.nextLine().toLowerCase();

        boolean result = lowercaseSentence.contains(search);

        int index = lowercaseSentence.indexOf(search);
        int length = search.length();

        System.out.println("True or False: The sentence contains your search term... " + result);
        System.out.println("Your search result first appears at index " + index + ", and is " + length + " characters" +
                " " +
                "long.");

        String cutStr = lowercaseSentence.replace(search, "");
        System.out.println(cutStr);
    }
}
