package Function_and_methods;

public class binarytodecimal {
    public static void bintodec(int binary){
        int decimal=0;
        int power=0;
        
        while(binary>0){
            int lastdigit=binary%10;
            decimal=decimal+(int)(lastdigit*Math.pow(2,power));
            power++;
            binary/=10;
        }
        System.out.println("binary to decimal conversion of"+"is"+decimal );
    }
    public static void main(String[] args) {
        bintodec(11);
    }
}
