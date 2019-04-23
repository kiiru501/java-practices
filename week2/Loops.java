import java.util.Scanner;

public class Loops {
    public static void main (String[] args){
        Scanner reader= new Scanner(System.in);
        
        System.out.println("Type Numbers:");
        int number;
        int count=0;
        int howMany=0;
        int sum=0;
        int evenNumber=0;
        int oddNumber=0;
        
        while(true){
           
            number=Integer.parseInt(reader.nextLine());
            if(number != -1 && count<number){
                
                howMany+=count;
                sum+=number;
                count++;
                if(number%2==0){
                    evenNumber++;
                }
                if(number%2==1){
                    oddNumber++;
                }
                
                
            }else{
                 System.out.println("Thank you and see you later !");
                 System.out.println("The sum is: " + sum);
                 System.out.println("How many numbers: " + count);
                 float average=sum/count;
                 System.out.println("Average: " + average);
                 System.out.println("EvenNumbers: " + evenNumber);
                 System.out.println("OddNumbers: " + oddNumber);
                  
                 
                 break;
                 
            }
            
            
            
            
        }
    }
}