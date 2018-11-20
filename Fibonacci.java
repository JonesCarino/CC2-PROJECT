package fibonacci;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        display();
    }
    static void display(){
        
        Scanner input = new Scanner(System.in);
        int x;
        
        System.out.println("Enter a number");
        x = input.nextInt();
        
        for( int b = 0; b<=x; b++){
            System.out.print("f("+ b +")"+"\t");
        }
        System.out.println("");
        for(int a = 0; a<=x; a++){
        for(int num = 0; num<=a; num++){
            System.out.print(factorial(num) + "\t");
        }
            System.out.println("");
        
        }
    }
    static int factorial (int n){
        if (n<=1){
            return n;
        }
        else{
            return(factorial(n-1) + factorial (n-2));
        }
    }
}
