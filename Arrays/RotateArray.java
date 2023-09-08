class RotateArray {
     public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7};
        int k = 4;
        rotate(a,k);
        for(int x : a)
        System.out.print(x+" ");
    }


    public static void rotate(int[] nums, int k) {
       int n = nums.length;
       if(n<=1) return;
       k %= n;
       reverse(nums,0,n-k-1);
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1);
    }

    public static void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}