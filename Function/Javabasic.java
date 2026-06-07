import java.util.*;
public class Javabasic{
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculate(int num1 , int num2){  //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a = "+num1);
        System.out.println("b = "+num2);
        
    }
    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static int fact(int num){
        int f=1;
        for(int i = 1; i<=num;i++){
            f = f * i;
        }
        return f;
    }
    public static int binomial(int n1 , int n2){
        int n = fact(n1);
        int r = fact(n2);
        int k = fact(n1-n2);

        int bc = n / (r*k);
        return bc;
    }
    public static void main(){
        int a = 5;
        int b = 10;
        swap(a,b);//call by value:-it pass the copy of value
        // int prod = multiply(a,b);
        // System.out.println(prod);
        // prod = multiply(10,20);
        // System.out.println(prod);
        // System.out.println(fact(10));
        System.out.println(binomial(5,2));

    }
}

// Call by reference means passing the original value to the function