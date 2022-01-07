package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("ID number: ");
            id = sc.nextInt();

            if (id > 0){
                System.out.print("Student Name: ");
                String studentName = sc.next();
                students.put(id, studentName);
                sc.nextLine();

            }
        } while (id != 0);

        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getValue() + "'s ID is " + student.getKey());
        }

    }
}
