/*
 * Dharam Patel
 * Student ID: 991529519
 */
package studenttest;

/**
 *
 * @author DHARAM
 */
public class Student {
    private String studentName;

    public Student(String getStudentName) {
        studentName = getStudentName;
    }
    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
