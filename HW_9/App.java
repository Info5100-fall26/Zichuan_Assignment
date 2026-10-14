public class App {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Smith");
        EngClass engClass = new EngClass();

        Student student2 = new Student(2, "John", "Brown");
    

        engClass.addStudent(student1);
        engClass.addStudent(student2);
        engClass.displayStudents();

        engClass.removeStudent(student1);
        engClass.displayStudents();
    }
    
}
