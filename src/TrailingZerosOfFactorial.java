public class TrailingZerosOfFactorial {
    public static int trailingZerosOfFactorial(int n){
        //initialize the result with 0 first
        int result =0;
        // run a loop until n gets updated to 0
        //all we need is the multiples of 5, and then add multiple of 5 until it becomes 0
        //for ex. 25. 25/5=5, result =5, then second iteration will have 5/5=1, result =5+1=6
        while(n>0){
            n=n/5;
            result +=n;
        }return result;
    }
    public static void main(String[] args) {

    }
}
