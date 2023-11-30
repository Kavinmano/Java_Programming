package OOPS.TypesOfInheritance;

public class DataTypes {
    public static void main(String[] args) {
        /*toString
        toBinarySting
        valueOf
        parseInt*/
        String s = Integer.toString(55);
        System.out.println(s);

        String x = Integer.toBinaryString(15);//OctalState Also Can Be used and Hexadecimal Can Also Be used
        System.out.println(x);
        int y = Integer.parseInt(x);
        System.out.println(y);
        String su = "Hello Kavin";
        System.out.println(su.equals("King"));
        char arr[] = su.toCharArray();
        System.out.println(arr[9]);
    }
}
