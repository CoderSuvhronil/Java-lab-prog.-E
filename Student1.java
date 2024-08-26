import java.util.Scanner;

public class Student {
    // Fields
    private String name;
    private double totalScore;
    private int numberOfQuizzes;

    // Constructors
    public Student(String name, double score) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    public Student(double score, String name) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numberOfQuizzes = 0;
    }

    // Methods
    public String getName() {
        return name;
    }

    public double getAverage() {
        if (numberOfQuizzes == 0) {
            return 0;
        }
        return totalScore / numberOfQuizzes;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void addQuiz(double score) {
        totalScore += score;
        numberOfQuizzes++;
    }

    public void printStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Average Score: " + getAverage());
    }
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Read the student's name
System.out.print("Enter the student's name: ");
String studentName = scanner.nextLine();

// Create a Student object using the name
Student student = new Student(studentName);

// Read three quiz scores
for (int i = 1; i <= 3; i++) {
    System.out.print("Enter score for quiz " + i + ": ");
    double score = scanner.nextDouble();
    student.addQuiz(score);
}

 // Print the student details
 student.printStudent();

 // Close the scanner
 scanner.close();
}
}
