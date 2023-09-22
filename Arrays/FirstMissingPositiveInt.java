class FirstMissingPositiveInt {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Turn all negs to zero
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0) nums[i] = 0;
        }

        // Marking the array to be used as HashSet
        for(int i = 0 ; i < nums.length; i++){
            int absVal = Math.abs(nums[i]);
            if(absVal >= 1 && absVal <= nums.length){
                if(nums[absVal-1] < 0) continue;
                else if(nums[absVal-1] == 0) nums[absVal-1] = -(n+1);
                else {
                    nums[absVal-1] = -nums[absVal-1];
                }
            }
        }

        // Finally matching the values with solution set : [1 - len(arr)+1]
        for(int i = 1; i <= n+1; i++){
            if(i-1 >= n ) return i;
            if(nums[i-1] >= 0) return i;
        }
        return -1;

    }
}