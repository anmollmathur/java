
import java.util.Scanner;

public class Jkode{
    public static void main(String[] args) {

        System.out.println("Enter ");
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter no n");
            n = sc.nextInt();
            System.out.println("Enter m");
            int m =sc.nextInt();
        }


       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("*");
            }
            System.out.println();
        }
        

    }
}
