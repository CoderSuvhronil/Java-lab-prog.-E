import java.io.*;

class Student {
    private String name;

    // Constructor with no parameters
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        // Taking input
        System.out.print("Enter student name: ");
        String studentName = dis.readLine();

        Student student1;
        if (studentName.isEmpty()) {
            student1 = new Student();
        } else {
            student1 = new Student(studentName);
        }

        student1.printName();
    }
}