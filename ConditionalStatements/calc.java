package ConditionalStatements;
import java.util.*;


public class calc {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter Second number:");
        int num2=sc.nextInt();
        System.out.println("Enter operation u ywant to perform)");

        char operator=sc.next().charAt(0);
         switch(operator){
            case '+':System.out.println(num1+num2);
             break;
            case '-':System.out.println(num1-num2);
             break;
            case '*':System.out.println(num1*num2);
             break; 
            case '/':System.out.println(num1/num2);
             break;
            case '%':System.out.println(num1%num2);
             break;

            
         }


    }
    
}
