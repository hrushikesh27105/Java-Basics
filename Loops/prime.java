package Loops;
import java.util.*;


public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                isPrime=false;
            }

        }
        if(isPrime==true){
            System.out.println("Number is Prime.");
        }
        else{
            System.out.println("number is not prime");
        }
       
    }
    
}
