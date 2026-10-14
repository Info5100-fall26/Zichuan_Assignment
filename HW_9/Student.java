import java.util.ArrayList;

public class Student {
    
    private int studentId;
    private String firstName;
    private String lastName;

    public int getStudentId(){
        return studentId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Student(int id, String first, String last){
        this.studentId = id;
        this.firstName = first;
        this.lastName = last;
    }

    
}
class EngClass {
    ArrayList<Student> students = new ArrayList<Student>();
    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    } 

    public void displayStudents(){
        for(Student student : students){
        System.out.println(student.getStudentId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        }
    }


}
