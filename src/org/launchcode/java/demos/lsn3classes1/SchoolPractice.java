package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
//        var student1 = new Student();
//        student1.setName("Rick Grimes");
//        student1.setStudentId(8675309);
//        student1.setNumberOfCredits(6);
//        student1.setGpa(3.2);

        var student1 = new Student("Negan", 12321, 9, 2.8);
        var student2 = new Student("Negan", 12321, 9, 2.8);


        System.out.println("Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Credits: " + student1.getNumberOfCredits());
        System.out.println("GPA: " + student1.getGpa());

        System.out.println("Name: " + student2.getName());
        System.out.println("Student ID: " + student2.getStudentId());
        System.out.println("Credits: " + student2.getNumberOfCredits());
        System.out.println("GPA: " + student2.getGpa());

        System.out.println(student1.equals(student2));
    }
}
