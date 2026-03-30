package Loops;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=sc.nextInt();
        while(n>0){
            int last=n%10;
            System.out.print(last+" ");
            n/=10;

        }
    }
    
}
