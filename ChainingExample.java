class ChainingExample {
    private String name;
    private int age;

    // Default constructor that calls the parameterized constructor with default values
    public ChainingExample() {
        this("Unknown", 0); // Calls Constructor 3 with default values
    }

    // Constructor with one parameter that calls the two-parameter constructor
    public ChainingExample(String name) {
        this(name, 0); // Calls Constructor 3 with a name and default age
    }

    // Constructor with two parameters that initializes the instance variables
    public ChainingExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ChainingExample obj1 = new ChainingExample();       // Uses the default constructor
        ChainingExample obj2 = new ChainingExample("John"); // Uses the constructor with one parameter
        ChainingExample obj3 = new ChainingExample("Jane", 25); // Uses the constructor with two parameters

        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
    }
}
