package Loops;
import java.util.*;

public class sumofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        int sum=0;
        int val=1;
        while(val<=n){
            sum=sum+val;
            val++;
        }
        System.out.println("Sum is"+sum);

    }
    
}
