package OOPS;

//Two Types Procedure Oriented and Object-Oriented
//Class is a collection of fields and methods

/*public class Classes_And_Objects {
    public static void main(String[] args) {

    }
}*/

class AppForm
{
    String name;
    int rollno;

    public void display()
    {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        AppForm codeio = new AppForm(); // Syntax for creating Class AppForm is said to be a constructor which can used class name as a function
        codeio.name = "Kavin_Tes";
        codeio.rollno = 492;
        codeio.display();
    }

}
