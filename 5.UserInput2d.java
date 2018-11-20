package UserInput2d;
import java.util.Scanner;
public class UserInput2d {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     int rows;
     int columns;
     
      
      System.out.println("Enter number of rows: ");
            rows = sc.nextInt();
      System.out.println("Now enter number of columns:");
            columns = sc.nextInt();
          
            int[][]matrix = new int[rows][columns];
             
            
           for(int i = 0; i < rows; i++){
                    for (int j = 0; j < columns; j++){   
                    System.out.println("Enter the number for row" + i +"and column" + j +":");
          
           matrix [i][j] = sc.nextInt();
            
           System.out.println("Array:");
                for(i = 0; i < rows; i++){
                   for(j = 0; j < columns; j++){
                   System.out.print(matrix [i][j] + "\t");
                   
               }
             System.out.println("\t");
           }
           }
        }   
    }
 }   

