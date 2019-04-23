import java.util.Scanner;

public class SumOfASetOfNumbers{
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        
        System.out.print("Upto: ");
        int first= Integer.parseInt(reader.nextLine());
        int sum=0;
        int count=0;
        
        
        
        while(count<=first){
            sum+=count;
            System.out.println(count);
            count++;
            
            
        }
        System.out.println("Sum is : "+ sum);
        
    }
}