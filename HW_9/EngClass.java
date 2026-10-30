import java.util.Arraylist;

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
