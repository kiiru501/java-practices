import java.util.Scanner;

class UpToACertainNumber {
    public static void main (String[] args) {
        
        Scanner reader= new Scanner(System.in);
        
        System.out.print("Up to What Number? : ");
        int number=Integer.parseInt(reader.nextLine());
        int read= 0;
        
        while(read<=number){
            System.out.println(read ++);
        }
        
    }
}