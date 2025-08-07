import java.util.Scanner;

class Person {
    String name;
    
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    void showDetails() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }

    void showStudentDetails() {
        showDetails();
        System.out.println("Roll Number: " + rollNo);
    }
}
class InheritanceExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.getStudentDetails();
        s.showStudentDetails();
    }
}
