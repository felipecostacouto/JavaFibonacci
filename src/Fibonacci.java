import java.util.*;  

public class Fibonacci {
    
    static int ant;
    public static void fibonacci (int n){
        long fibo[] = new long[n+1];
        System.out.println("Numbers of fibonacci sequence: ");
        for(int i =0; i<=n ;i++){
            
            if(i < 2){
                fibo[i] = i;
            }
            else{
                fibo[i] = fibo[i-1] + fibo[i-2];
               }

               System.out.print(fibo[i]+" ");
        }
        
    }

    public static void main(String[] args)  {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("define how many numbers from the fibonacci sequence do you want to see: "); 
            int num = sc.nextInt();
            fibonacci(num);
        }
    }
}
