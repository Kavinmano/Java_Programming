package OOPS.TypesOfInheritance;
import java.util.Scanner;
import java.io.File;

public class File_Reading {

        public static void main(String[] args) {
            try{ //Always File Reading Takes Place In Try Catch Method
                File f = new File("Example.txt");
                Scanner reader = new Scanner(f);
                while (reader.hasNextLine());{
                    System.out.println(reader.nextLine());
                }
            }
            catch(Exception E){
                System.out.println(E);
            }

        }
    }

