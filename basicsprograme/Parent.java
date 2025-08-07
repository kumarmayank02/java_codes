import java.util.Scanner;

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

 class DynamicDispatchUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Parent class, 2 for Child class: ");
        int choice = sc.nextInt();

        Parent obj;
        if (choice == 1) {
            obj = new Parent();
        } else {
            obj = new Child();
        }

        obj.show(); // Dynamic method dispatch
        sc.close();
    }
}
