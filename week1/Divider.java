import java.util.Scanner;

public class Divider {
    public static void  main (String[] args){
        Scanner writer= new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int first =Integer.parseInt(writer.nextLine());
        System.out.print("Type a another number: ");
        int second =Integer.parseInt(writer.nextLine());
        
        float divide =first / second;
        
       
        System.out.printf("Division: %2f ", divide);
    }
}