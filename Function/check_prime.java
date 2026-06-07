public class check_prime{
    //corner case

    public static  boolean isprime(int n){
        // if(n==2){
        //     return true;
        // }
        boolean isPrime = true;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static boolean isprimeoptmised(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i = 2;i<Math.sqrt(n); i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
    public static void main(){
        // System.out.println(isprime(2));
        System.out.println(isprimeoptmised(7));
    }
}
// optimised approach for prime
