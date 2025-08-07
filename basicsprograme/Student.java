// Define the Student class
class Student {
    String name;
    int age;
    double grade;

    // Constructor 1: No parameters (default constructor)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
        System.out.println("Default constructor called");
    }

    // Constructor 2: One parameter (name)
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.grade = 0.0;
        System.out.println("Constructor with name called");
    }

    // Constructor 3: Two parameters (name and age)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
        System.out.println("Constructor with name and age called");
    }

    // Constructor 4: Three parameters (name, age, and grade)
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("Constructor with name, age, and grade called");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Main class to test constructor overloading
 class Main {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student(); // Calls default constructor
        student1.displayDetails();

        Student student2 = new Student("Amit"); // Calls constructor with name
        student2.displayDetails();

        Student student3 = new Student("Priya", 20); // Calls constructor with name and age
        student3.displayDetails();

        Student student4 = new Student("Rahul", 22, 85.5); // Calls constructor with name, age, and grade
        student4.displayDetails();
    }
}