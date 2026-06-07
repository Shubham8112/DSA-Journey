//function to calculate sum of two number
public class part2{
    public static int sum(int n,int m){
        return n+m;
    }
    
    public static int sum(int n,int m,int k){
        return n+m+k;
    }
    public static void main(){
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,5));
    }
}