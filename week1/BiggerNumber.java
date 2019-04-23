import java.util.Scanner;
import java.lang.Math;

public class BiggerNumber{
    public static void main (String[] args){
        Scanner reader =new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int one =Integer.parseInt(reader.nextLine());
        System.out.print("Type a another number: ");
        int two =Integer.parseInt(reader.nextLine());
        
        int big =Math.max(one,two);
        
        System.out.println("The bigger number of the two numbers given was: " + big);
        
        
        
    }
}
