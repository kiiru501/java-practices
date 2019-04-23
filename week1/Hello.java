import java.util.Scanner;

public class Hello{
    public static void main (String[] args){
        
        System.out.println("Hello World");
        System.out.println("(And all the people of the world)");
        
        for(int i=0; i<10; i++){
            for(int j=0; j<10-i; j++)
                System.out.print(" ");
            for(int k=0;k<(2*i+1);k++)
                System.out.print("*");
            System.out.println();    
        }
        int remainder =7% 2;
        
        System.out.println(remainder);
        
        int first= 3;
        int second =2;
        double result1=(double)first/second;
        
        System.out.println(result1);
        
        double integerResultBecauseTypeIsInteger=3 / 2.0;
        
        System.out.println(integerResultBecauseTypeIsInteger);
        
        Scanner reader= new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name= reader.nextLine();
        
        System.out.println("Hi " + name);
        
        System.out.println("What is your ticket number?");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println(number);
        
       
    }
}
