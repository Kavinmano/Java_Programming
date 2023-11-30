package OOPS;


public class Inherit {

    static class Animal {
        int noLegs = 4;
    }

    public void eat() {
        System.out.println("I am Eating");
    }

    public void walk() {
        System.out.println("I am Walking");
    }

    static class Dog extends Animal {
        boolean canBark = true;
    }

    public static void main(String[] args) {
        Inherit obj = new Inherit();
        Animal animalObj = new Animal();

        System.out.println(animalObj.noLegs);

        obj.eat();
        obj.walk();
    }
}



