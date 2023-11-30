package OOPS;

// Polymorphism is one interface, many implementations
public class Polymorphism {

    void display() {
        System.out.println("I am a Void Function");
    }

    void display(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism();
        obj1.display();
        obj1.display(5);
    }
}
