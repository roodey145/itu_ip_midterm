package methodAndFields;

// The student class inherits all the method that are not private from the Human-class
// This means, you can use all the Human class methods that are not private inside the
// student class as if they belong to the student class.
// For example: the Human class has the function getAge and display, thus, you can use
// those method inside the Student class because they are not private. 
// Notice that the display method is actually using the Human class  display method
public class Student extends Human {
    private static int studentsCount = 0;
    private int studentID;

    public Student(String name, int age) {
        super(name, age);
        studentID = ++studentsCount;
    }

    // Getters/Accessors
    public int getStudentID() {
        return studentID;
    }

    //
    @Override
    public void display() {
        super.display();
        System.out.println(" -> StudentID: " + getStudentID());
    }
}
