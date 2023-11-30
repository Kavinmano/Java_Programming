public class While_Loop {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        int i = 1;
       /* while(i<=n)
        {
            sum += i;
            i++;
        }*/
        do {
            sum += i;
            i++;
        }
        while (i<=n);
        System.out.println("Sum Of n Num:" + sum);
    }
}
