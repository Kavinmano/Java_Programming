package Arrays;

public class Prob1 {
    public static void main(String[] args) {
        int[] rollno = new int[50]; // space allocation, use contiguous memory allocation
        rollno[0] = 5;
        rollno[1] = 54;
        rollno[2] = 45;
        rollno[3] = 35;
        rollno[4] = 25;
        rollno[5] = 15;
        for (int i = 0; i < 5; i++) {
            System.out.println(rollno[i]);
        }
    }
}
