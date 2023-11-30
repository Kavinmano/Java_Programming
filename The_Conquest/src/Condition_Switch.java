public class Condition_Switch {
    public static void main(String[] args) {
        char attendence = 'O';
        switch(attendence)
        {
            case 'O':
                System.out.println("On Duty");
                break;
            case 'P':
                System.out.println("Attended Classes");
                break;
            case 'A':
                System.out.println("Not Attended The Class");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
