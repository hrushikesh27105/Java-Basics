package Loops;
import java.util.*;

public class ctn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("enter number:");
        int num=sc.nextInt();
        if(num%10==0){
            continue;
        }
        System.out.println(num);


    }
    while(true);
}
    
}
