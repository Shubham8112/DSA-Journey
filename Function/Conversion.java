public class Conversion{
    public static void bintodec(int n){
        int mynum = n;
        int power= 0;
        int dec = 0;
        while(n>0){
          int lastdigit = n % 10;
          dec = dec + (lastdigit* (int)Math.pow(2,power));
          power++;
          n = n / 10;
        }
        System.out.println("decimal of " + mynum + " = " + dec);
    }
    public static void main(){
        bintodec(1001);
    }
}