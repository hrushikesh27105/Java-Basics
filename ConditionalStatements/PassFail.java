package ConditionalStatements;
import java.util.*;


public class PassFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of student (out of 100):");
        int marks=sc.nextInt();
        String result=marks>=33 ? "Passed" : "Failed";
        System.out.println(result);
        
        
        

        
    }
    
}
