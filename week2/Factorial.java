import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int count=1;
        int product = 1;
        
        while(count<=number){
            product*=count;
            System.out.println(product);
            count++;
            }
        System.out.println("Factorial is " + product);
        
    }
    
}
       
        