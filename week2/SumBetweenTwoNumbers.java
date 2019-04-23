import java.util.Scanner;

public class SumBetweenTwoNumbers{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        
        System.out.print("First: ");
        int first=Integer.parseInt(reader.nextLine());
        System.out.print("last: ");
        int last=Integer.parseInt(reader.nextLine());
        int sum=0;
        int count= 0;
        
        while(first<=last){
            sum+=first;
            first++;

        }
        System.out.println("The sum is: " + sum);
    }
        
}

       
 
            