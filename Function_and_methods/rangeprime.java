package Function_and_methods;
import java.util.*;

public class rangeprime {

    public static boolean isprimeno(int n) {
        if(n <= 1) return false;   // important case
        if(n == 2) return true;

        for(int i = 2; i <= Math.sqrt(n); i++) {   // ✅ fix here
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void range(int n) {
        for(int i = 2; i <= n; i++) {
            if(isprimeno(i)) {   // ✅ call once
                System.out.print(i + " ");   // ✅ print in same line
            }
        }
    }

    public static void main(String[] args) {
        range(12);
    }
}