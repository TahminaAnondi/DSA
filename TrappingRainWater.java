package DSA;

public class TrappingRainWater{
    public static int trappingRainWater(int height[]){
        //calculate leftMax Boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate rightMax Boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1], height[j]);
        }
        int trappedRainWater = 0;
        //loop
        for(int i=0;i<height.length;i++){
            //water level = min(leftMax boundary, rightMax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water = water level-height[i]
            trappedRainWater += waterLevel-height[i]; 
        }
        
return trappedRainWater;
        
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappingRainWater(height));

    }
}