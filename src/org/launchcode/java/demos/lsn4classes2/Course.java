package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String toString(){
        return instructor.getFirstName() + " " + instructor.getLastName() + "'s course on " + topic + " has " +
                enrolledStudents + " students.";
    }

    public boolean equals(Course name){

        if (name.getClass() != getClass()) return false;

        if (name == null) return false;

        if (name == this) return true;

        return ((Course)name).instructor == instructor && ((Course)name).topic == topic;
    }

}
