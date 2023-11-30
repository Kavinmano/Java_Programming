package OOPS.TypesOfInheritance;

// Multiple Inheritance
// Abstraction is said to be Data Hiding
public class Abstract {
    abstract static class Computer {
        void turnOn() {
            System.out.println("Turning On");
        }
    }

    static class Hp extends Computer {
        void turnOn()
        {
            System.out.println("Turn On-1");
        }
    }

    static class Dell extends Computer {
        void turnOn()
        {
            System.out.println("Turning Off");
        }
    }

    public static void main(String[] args) {
        Hp ob = new Hp();
        ob.turnOn();
        Dell ob1 = new Dell();
        ob1.turnOn();
    }
}
