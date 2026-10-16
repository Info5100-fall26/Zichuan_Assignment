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

