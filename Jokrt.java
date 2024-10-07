import java.util.Scanner;

class Jokrt{
    public static void sumOfNaturalNo() {
        int n;
        System.out.println("enter the value of number");
        Scanner sc=new Scanner(System.in);
        n =  sc.nextInt();
        int sum=0;
        if(n<=0){
            
            sum=sum+n;
            System.out.println(sum);
            return;
        
        
        }
        n+=1;

        sumOfNaturalNo();
        
        sc.close();
    
        
    }   
    
    public static void main(String[] args) {
        
        sumOfNaturalNo();

    }
}