package OOPS;
//Constructor can be parameterized and Non Parameterized Constructors
class Sample{
    int rollno;
    int marks;

    Sample(int num,int mark) // Default Constructor
    {
        System.out.println("This is Default Constructor");
        rollno = num;
        marks = mark;
    }
}
class Construct
{
    public static void main(String[] args) {
        Sample obj = new Sample(49,99);
        System.out.println(obj.marks);
        System.out.println(obj.rollno);
    }
}