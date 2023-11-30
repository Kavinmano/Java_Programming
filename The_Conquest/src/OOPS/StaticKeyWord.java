package OOPS;

public class StaticKeyWord { //Main Function Should Be static Because of Space Complexity

    class Father {
        char gender ;
        static int age;

         void print(char gender,int age) { // Keyword Final Wont allow Overriding
            System.out.println("Parent Class");
            this.gender = gender;
            this.age = age;

        }
    }

    class Dau extends Father {
        char gender ;
        static int age;
        void print()
        {

            System.out.println(super.age);
        }

    }

    public static void main(String[] args) {
        StaticKeyWord staticKeyWord = new StaticKeyWord();
        staticKeyWord.run();
    }

    void run() {
        Dau M = new Dau();
        System.out.println(M.gender);
        System.out.println(M.age);
        System.out.println(Dau.age);
        M.print();
    }
}
