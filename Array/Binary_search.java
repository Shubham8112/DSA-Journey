import java.util.*;
public class Binary_search{
    public static int binary_search(int number[],int key){
        int start = 0,end=number.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){//right
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return   -1;    
    }
    public static void main(){

        int number[] = {2,4,6,8,10,12,14,16};
        int key=16;
        System.out.println(binary_search(number,key));
    }
}