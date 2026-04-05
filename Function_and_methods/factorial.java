package Function_and_methods;
import java.util.*;

public class factorial {
    public static void fact(int n){
        int f=1;
        for(int i=1; i<=n;i++){
            f=i*f;
            
        }
        System.out.println("factorial of given number is:"+f);
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        fact(num);
    }

    
}
