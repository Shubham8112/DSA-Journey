public class Largest_number{
    public static int getLargest(int  number[]){
        int largest = Integer.MIN_VALUE;
        int  smallest = Integer.MAX_VALUE;
        for(int i = 0; i <number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("Smallest value: "+ smallest);
        return largest;
    }
    public static void main(){
        int number[]  = {1,2,6,8,7};
        System.out.print(getLargest(number));

    }      
}