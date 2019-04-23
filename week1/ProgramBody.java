import java.util.Scanner;

public class ProgramBody{
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("What is your name? ");
        String name= reader.nextLine();
        System.out.println("Hi, "+ name);
        
        System.out.println("What is your ticket number?");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println(name +" " + "has ticket no. " + number);
    }
}


  