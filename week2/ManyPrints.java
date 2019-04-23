import java.util.Scanner;


public class ManyPrints{
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        
        System.out.println("How many?");
        int number =Integer.parseInt(reader.nextLine());
        int count =0;
        int total=0;
        
        while(count<=number){
           System.out.println(count);
           count++;
           printText();
        }
        
    }
    public static void  printText(){
        System.out.println("In the beginning there was the swamp, hoe and Java.");
    }
    
}