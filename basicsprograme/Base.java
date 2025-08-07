//Qno 9 
class Base {
    int value;

    void display() {
        System.out.println("Base value: " + value);
    }
}

class Derived extends Base {
    int extraValue;

    void showExtra() {
        System.out.println("Extra value: " + extraValue);
    }
}

 class InheritanceSimple {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.value = 10;
        obj.extraValue = 20;
        obj.display();
        obj.showExtra();
    }
}

//output 
// / C:\Users\Saif\Desktop\JAVA JRU>java InheritanceSimple
// Base value: 10
// Extra value: 20

// C:\Users\Saif\Desktop\JAVA JRU>//