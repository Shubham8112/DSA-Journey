import java.util.*;
public class Linear_search{
    public static int search(int number[],int key){
        for(int i = 0;i<number.length;i++){
            if(number[i]  ==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]= {2,4,6,10,12,14,16};
        int key = 101;
        int index = search(number,key);
        if(index == -1){
            System.out.print("not found");
        }else{
        System.out.println("Key is at index: "+ index);

        }
    }
}   