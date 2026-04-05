package Function_and_methods;

public class decimaltobinary {
    public static void dec(int n){
        int power=0;
        int binary=0;
        while(n>0){
            int rem=n%2;
            binary=binary+(rem*(int)Math.pow(10, power));
            n/=2;
            power++;
            
        }
        System.out.println("decimal to binary of"+"is"+binary );
    }
    public static void main(String[] args) {
        dec(4);
    }
}
