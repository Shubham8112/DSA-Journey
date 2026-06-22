import java.util.*;
public class Trapping_rainwater{
    public static int trappedrainwater(int height[]){
        //calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1 ; i < height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2 ; i >= 0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trappedwater = 0;
        for(int i = 0; i < height.length; i++){
        //waterlevel = min(left max bound , right max bound)
           int waterlevel = Math.min(leftmax[i],rightmax[i]);

        //trapped water = waterlevel - height[i]
           trappedwater += waterlevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String arg[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}