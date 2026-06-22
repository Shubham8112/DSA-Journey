import java.util.*;
public class practice{
    public static int binary_search(int number[],int key){
        int start = 0,end=number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            if(number[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void largest_number(int number[]){
        int largest= Integer.MIN_VALUE;
        for(int i =  0 ;i<=number.length-1;i++){
            if(number[i]>largest){
                largest=number[i];
            }
        }
        System.out.println(largest);
    }
    public static void pair(int number[]){
        for(int i  = 0 ; i <= number.length-1 ; i++){
            for(int j = i+1;j<=number.length-1;j++){
                System.out.print("("+number[i]+","+number[j]+"), ");
            }
        }
    }
    public static void subarray(int number[]){
        int max=0;
        for(int i = 0 ; i < number.length;i++){
            int sum = 0;
            for(int j = i ; j < number.length;j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
                sum += number[j];
            }
            if(max<sum){
                max = sum;
            }
            System.out.println("Sum of Array:- "+sum);
            sum = 0;
        }
        System.out.println("Maximum sum of subarray:- "+max);
    }
    public static void main(){
        int number[] = {2,4,6,8,10};
        // int key= 7;
        // int p = binary_search(number,key);
        // largest_number(number);
        // System.out.println("The index of my number is: "+ p);
        // pair(number);
        subarray(number);
    }
}