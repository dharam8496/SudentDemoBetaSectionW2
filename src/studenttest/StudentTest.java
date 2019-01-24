/*
 * Dharam Patel
 * Student ID: 991529519
 */
package studenttest;

/**
 *
 * @author DHARAM
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] s = new Student[5];
        s[0] = new Student("Devraj");
        s[1] = new Student("Sharon");
        s[2] = new Student("Mihir");
        s[3] = new Student("Vinit");
        s[4] = new Student("Nicholas");
        
        for(int i=0; i<s.length; i++) {
            System.out.println(s[i].getStudentName());
        }
    }
    
}
