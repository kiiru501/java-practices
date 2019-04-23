import java.util.Scanner;

public class LowerLimitUpperLimit{
    public static void main (String[] args){
        Scanner reader=new Scanner(System.in);
        
        System.out.print("First:");
        int first=Integer.parseInt(reader.nextLine());
        System.out.print("Last:");
        int last=Integer.parseInt(reader.nextLine());
        
        while(true){
            if(first<=last){
                System.out.println(first ++);
            }else{
                break;
            }
            
        }
    }
}  