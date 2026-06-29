class Solution {
    public int trap(int[] height) {
        int water=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            int leftmax=0;
            int rightmax=0;
            for(int j=0;j<=i;j++){
                if(height[j]>leftmax){
                    leftmax=height[j];
                }
                
            }
            for(int j=i;j<n;j++){
                if(height[j]>rightmax){
                    rightmax=height[j];
                }
            }
            water+=Math.min(leftmax,rightmax)-height[i];
        }
        return water;
        
    }
}
