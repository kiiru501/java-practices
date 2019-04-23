import java.lang.Math;
import java.util.Scanner;

public class AgeSum{
    public static void main (String[] args){
        Scanner trial = new Scanner(System.in);
        
      System.out.print("Type your name: ");
      String one =trial.nextLine();
      
      System.out.print("Type your age: ");
      int two =Integer.parseInt(trial.nextLine()); 
      
      System.out.print("Type your name: ");
      String three=trial.nextLine();
      
      System.out.print("Type your age: ");
      int four=Integer.parseInt(trial.nextLine());
      
      int yearsTotal= two + four;
      
      System.out.println(one  + " and "+ three  +" are " +yearsTotal+ " years old in total.");
    }
}