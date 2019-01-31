/*
 * Dharam Patel
 * Student ID: 991529519
 */
package studenttest;

/**
 *
 * @author DHARAM
 * 31st JAN 2019
 */
public class Student {
    private String studentName;
    private int studentid;

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

    /**
     * @return the studentid
     */
    public int getStudentid() {
        return studentid;
    }

    /**
     * @param studentid the studentid to set
     */
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    
}
