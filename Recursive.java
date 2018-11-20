package Recursive;

public class Recursive{
    public static void main(String[] args){
        int [] l = {3,5,7,13,2,3,5};
        int [] j = {1, 2, 3};
            display (j);
    }
    static void display (int [] l){
        for(int i = 0; i < l.length; i++){
            
            System.out.print ("f(" + l[i] + ")\t");
            System.out.print(fib (l));
            }
    }

    p
    }
}