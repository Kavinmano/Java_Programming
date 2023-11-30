public class Condition {
    public static void main(String[] args) {
        char attendence = 'O';

        if (attendence == 'P')
        {
            System.out.println("Attended Class");
        }
        else if(attendence == 'O')
        {
            System.out.println("On Duty");
        }
        else
        {
            System.out.println("Not Attended The Class");
        }
        System.out.println("Progress Ends");
    }
}
