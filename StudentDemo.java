class Student {
    // Attributes
    private int studentID;
    private String name;
    private double gpa;
    private static int studentCount = 0; // Static variable to count students

    public Student(int studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
        studentCount++; // Increment count when object is created
    }

   
    public void displayStudent() {
        System.out.println("Student ID: " + studentID + ", Name: " + name + ", GPA: " + gpa);
    }

    
    public static int getStudentCount() {
        return studentCount;
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        
        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.5);
        Student student3 = new Student(103, "Charlie", 3.9);

        
        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();

        
        System.out.println("Total students: " + Student.getStudentCount());
    }
}
