package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getGradeLevel(int credits) {
        if (credits <= 29) {
            return "Freshman";
        } else if (credits >= 30 && credits <= 59) {
            return "Sophomore";
        } else if (credits >= 60 && credits <= 89){
            return "Junior";
        } else {
            return "Senior";
        }

    }

    public void addGrade(int courseCredits, double grade) {
        Double total = this.gpa * this.numberOfCredits;
        total += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = total / numberOfCredits;
    }

    public String toString(){
        return name + "'s student ID is " + studentId + ". Their current GPA is " + gpa +
                ", and they have " + numberOfCredits + " credits.";
    }

    public boolean equals(Student comparison){

        if (comparison.getClass() != getClass()) return false;

        if (comparison == null) return false;

        if (comparison == this) return true;

        return ((Student) comparison).getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,70,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
