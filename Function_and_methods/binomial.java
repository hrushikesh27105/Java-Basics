package Function_and_methods;
import java.util.*;

public class binomial {
    public static void binomial_coef(int n,int r){
        int fact_a=1;
        for(int i=1;i<=n;i++){
            fact_a=fact_a*i;


        }
        int fact_b=1;
        for(int i=1;i<=r;i++){
            fact_b=fact_b*i;

        }
        int fact_c=1;
        int diff=n-r;
        for(int i=1;i<=diff;i++){
            fact_c=fact_c*i;
        } 
        int numerator=fact_a;
        int denominator=fact_b*fact_c;
        int result=numerator/denominator;
        System.out.println("binomail coefficient is:"+result);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        System.out.println("enter value of r:");
        int r=sc.nextInt();
        binomial_coef(n, r);

    }
    
}
