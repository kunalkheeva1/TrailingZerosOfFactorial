public class TrailingZerosOfFactorial {
    public static int trailingZerosOfFactorial(int n){
        int result =0;
        while(n>0){
            n=n/5;
            result +=n;
        }return result;
    }
    public static void main(String[] args) {

    }
}
