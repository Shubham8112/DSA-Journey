import java.util.*;
public class Max_subarray{
    public static void subarray(int number[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < number.length;i++){
            for(int j = i ; j<number.length;j++){
                for(int k = i ;k <= j;k++){
                    sum+=number[k];
                }
                System.out.println(sum);
                if(sum>max){
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println("Max sum: "+max);
    }
    public static void prefix_sum(int number[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i]= prefix[i-1] +number[i];
        }
        for(int i = 0 ; i < prefix.length;i++){
            int start = i;
            for(int j =i;j<number.length;j++){
                int end = j;
                curr_sum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum<curr_sum){
                    max_sum = curr_sum;
                }
            }
        }
            System.out.println("Max Sum ="+max_sum);
    }
    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i =0;i < number.length;i++){
            cs = cs+number[i];
            if(cs<0){
                cs= 0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our Max Subarray Sum is: "+ms);
    }
    public static void main(){
        int number[] = {1,-2,6,-1,3};
        int n[] ={-2,-3,4,-1,-2,1,5,-3};
        // subarray(number);
        // prefix_sum(number);
        kadanes(n);
    }
}

