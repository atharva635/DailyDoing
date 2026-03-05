class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int maxarea = 0;
        while(right>left){
            int minh = Math.min(height[right],height[left]);
            int minind = right-left;
            int area = minh*minind;
            maxarea = Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}