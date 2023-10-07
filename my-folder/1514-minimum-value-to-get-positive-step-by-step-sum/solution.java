class Solution {
    public int minStartValue(int[] nums) {
      int sum = 0;
        int startValue = 1;
        for(int element: nums){
            sum += element;
            if (sum < startValue) {
                startValue = sum;
            }
        }
        if (startValue == 1) {
            return 1;
        } else {
            return (1 - startValue);
        }  
    }
}
