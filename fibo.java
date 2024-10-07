
import java.util.Scanner;

public class fibo{
    public static void printFibo(int a ,int b,int n){

        if(n==0){
            return ;

        }
        int fib=a+b;
        System.out.println(fib);
        printFibo(b,fib,n-1);

    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n;
        System.out.println("enter the value for n");
        Scanner sc=new Scanner(System.in);
       
        n=sc.nextInt();
        sc.close();
        System.out.println(a);
        System.out.println(b);
        printFibo(a, b, n-2);
    }
}