import java.util.Scanner;

public class Product {
    public static void main(String[] args) 
        
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");

        int a=sc.nextInt();
        System.out.println("enter value of b:");
        int b=sc.nextInt();
        int product=a*b;
        System.out.println("product of a and b is:"+product);

    
}}
