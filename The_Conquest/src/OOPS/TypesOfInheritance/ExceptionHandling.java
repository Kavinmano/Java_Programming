package OOPS.TypesOfInheritance;

/*class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException E){
            System.out.println("b is Zero");
        }
       finally {
            System.out.println("Fianally Block");
        }

        System.out.println("Hello");
    }
}*/

class UserDefined extends Exception {

    UserDefined(String str)
    {
        super((str));
    }

}
class ExceptionHandling
{
    static void check (int age) throws UserDefined //using throws for USerDefined Keyword
    {
        if(age<18)
        {
            throw new UserDefined("Age is Invalid"); // throw keyword is used to throw an explicit exception
        }
    }

    public static void main(String[] args) {
        int a = 5;
        try {
            check(17);
        }
        catch(UserDefined E){
            System.out.println(E.getMessage());
        }
        System.out.println("Hello");
    }
}