public class PrintingLikeABoss {
    public static void main (String [] args){
        printWhiteSpaces(5);
        printWhiteSpaces(3);
        printWhiteSpaces(9);
        printStars(2);
        printTriangle(4);
    }
    
    private static void printWhiteSpaces(int size){
        int star= 0;
        while (star<size){
            
            System.out.print(" ");
            System.out.print("good");
            star++;
        }
        System.out.println(" ");
        
        
    }
    
    private static void printStars(int amount){
        int star= 0;
        while (star<amount){
            star++;
            System.out.print("*");
           /// System.out.print("hi");
            
        }
      ///  System.out.println(" ");
        
        
    }
    
    private static void printTriangle(int size){
        int count= 1;
        int spaces= -1;
        while (count<=size){
            while(spaces<=size){
                printWhiteSpaces(spaces--);
                System.out.println("he");
                
            
            }
           
           // printStars(count++);
        }
        
    }
}
    