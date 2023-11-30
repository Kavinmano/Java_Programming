package OOPS;

class ApplForm
{
    String name;
    int rollno;

    public void display()
    {
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setName(String str,int num)
    {
        name = str;
        rollno = num;
    }
    public static void main(String[] args) {
        ApplForm codeio = new ApplForm(); // Syntax for creating Class AppForm is said to be a constructor which can used class name as a function
        codeio.setName("Kavin_tes",44);
        codeio.display();

        ApplForm viewer = new ApplForm();
        viewer.name = "King";
        viewer.rollno = 7278;
        viewer.display();
    }
}

