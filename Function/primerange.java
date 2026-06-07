public class primerange{
    public static boolean isprime(int n){
            boolean isPrime = true;
            if(n==2){
                return true;
            }
            for(int i = 2;i<=Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            return isPrime;
    }
    public static void primeinrange(int n){
        for(int i = 2 ;i <= n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        primeinrange(20);
    }

}