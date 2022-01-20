package bookCodeAlongs;

import org.launchcode.java.demos.lsn3classes1.Student;

public class TestCase {
    public boolean equals(Object toBeCompared){
        if (toBeCompared == null){
            return false;
        }
        if (toBeCompared.getClass() != getClass()){
            return false;
        }
        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == theStudent.getStudentId();
    }
}
