class NonDecrArray {
     public static void main(String[] args){
        int a[] = {3,4,2,3};
        int b[] = {4,2,3};
        System.out.println(solution(a));
        System.out.println(solution(b));
     }

     static boolean solution(int[] arr){
        boolean changed = false;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                if(changed) return false;
                changed = true;
                if(i == 0 || arr[i+1] >= arr[i-1])
                arr[i] = arr[i+1];
                else 
                arr[i+1] = arr[i];
            }
        }

        return true;
     }
      
    }