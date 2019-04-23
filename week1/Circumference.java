import java.util.Scanner;

public class Circumference {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        int one=Integer.parseInt(reader.nextLine());
       
        double circumference= 2 *Math.PI * one;
        System.out.print("Circumfrence of the circle: " + circumference);
    }
}

