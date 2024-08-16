import java.io.*;

class Student1 {
    private String name;
    private double totalScore;
    private int numberOfQuizzes;

    public Student1(String name, double score) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    public Student1(double score, String name) {
        this(name, score);
    }

    public Student1(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numberOfQuizzes = 0;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        if (numberOfQuizzes == 0) return 0;
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

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);

        // Taking input
        System.out.print("Enter student name: ");
        String studentName = dis.readLine();

        Student1 student = new Student1(studentName);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter score for quiz " + i + ": ");
            double score = Double.parseDouble(dis.readLine());
            student.addQuiz(score);
        }

        student.printStudent();
    }
}
