import java.util.*;
public class cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price of pencil:");
        double pencil=sc.nextDouble();
        System.out.println("Enter price of pen:");
        double pen=sc.nextDouble();
        
        System.out.println("Enter price of Eraser:");
        double Eraser=sc.nextDouble();

        double GST=18/100;
        
        double cost=(pencil+(pencil*GST))+(pen+(pen*GST))+(Eraser+(Eraser*GST));

        System.out.println("Total cost is :"+cost);
    
    }
    
}
