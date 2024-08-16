class ChainingExample {
    private String name;
    private int age;

    // Constructor 1
    public ChainingExample() {
        this("Unknown", 0); // Calls Constructor 2
    }

    // Constructor 2
    public ChainingExample(String name) {
        this(name, 0); // Calls Constructor 3
    }

    // Constructor 3
    public ChainingExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        ChainingExample obj1 = new ChainingExample();
        ChainingExample obj2 = new ChainingExample("John");
        ChainingExample obj3 = new ChainingExample("Jane", 25);

        obj1.printInfo();
        obj2.printInfo();
        obj3.printInfo();
    }
}
