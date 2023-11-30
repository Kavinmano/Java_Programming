package OOPS;

public class Method_2 {
    public static void main(String[] args) {
        int res = add(10,15);
        res = res * 100;
        System.out.println(res);
        System.out.println("Ans is Printed");
    }
    public  static  int add(int a,int b) // Non void Parametrized Function.
    {
        int c = a + b;
        return c;
    }
}
