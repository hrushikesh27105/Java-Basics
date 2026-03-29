package ConditionalStatements;
import java.util.*;

public class largest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number.");
        int num1=sc.nextInt();
        System.out.println("Enter second number.");
        int num2=sc.nextInt();
        System.out.println("Enter Third number.");
        int num3=sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("First number is greatest among three.");
        }
        else if(num2>num1 && num2>num3){
             System.out.println("Second number is greatest among three.");

        }
        else{
            System.out.println("Third number is greatest among Three.");
        }

    }
    
}
