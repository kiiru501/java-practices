
public class Printing {
    public static void main (String [] args){
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(5);
        printRectangle(3,2);
        printTriangle(4);
    }

    
    private static void printStars(int amount){
        int star= 0;
        while (star<amount){
            star++;
            System.out.print("*");
        }
        System.out.println(" ");
        
        
    }
    
    private static void printSquare(int sideSize){
        int sideA =0;
        int sideB = 1;
        while(sideA<sideSize){
            while(sideB<sideSize){
                
                sideB++;
                
                System.out.print("*");
                
            }
            sideB=1; 
            sideA++;
            printStars(1);
           //System.out.println(" ");
           
        }
        
        
    } 
    private static void printRectangle(int width,int height){
        int col= 0;
        //int row = 1;
        while(col< width){
            int row = 0;
            while(row< height){
               row++;
              System.out.print("*");
               // printStars(1);
             // System.out.print(row);
            }
            
            col++;
          //System.out.println(" ");
          printStars(0);
          //System.out.println(col);
            
            
        }
    }
    
    private static void printTriangle(int size){
        int count = 1;
        
        while(count<=size){
            printStars(count++);
        }
    }
   
}        
     
    
    
  