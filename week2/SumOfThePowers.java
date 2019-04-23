import java.util.Scanner;

public class SumOfThePowers{
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int number =2;
        int sum =0;
        int count=0;
        
        while(count <= power){
            sum+=Math.pow(number,count);
            System.out.println(sum);
            count++;
        }
        int result = (int)Math.pow(number, power);
        System.out.println("The sum is: " + sum);
    }
}
        

 
      