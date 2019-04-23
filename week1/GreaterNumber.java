import java.util.Scanner;

public class GreaterNumber{
    public static void main (String[] args){
        Scanner reader= new Scanner(System.in);
        
        System.out.println("Type the First number: ");
        int first =Integer.parseInt(reader.nextLine());
        System.out.println("Type the First number: ");
        int second =Integer.parseInt(reader.nextLine());
        
        if (first>second){
            System.out.println("Greater Number: "+ first);
        }else if(second> first){
            System.out.println("Greater Number: "+ second);
        }else{
            System.out.println("The numbers are equal");
            
        }
    }
}