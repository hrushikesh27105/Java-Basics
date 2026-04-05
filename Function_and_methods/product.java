import java.util.*;
public class product {
    public static int multiply(int a,int b){
       
        System.out.println("product of a and b is:"+a*b);
            return a*b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        int a=sc.nextInt();
        System.out.println("enter value of b:");
        int b=sc.nextInt();
        multiply(a, b);
    }
    
}
