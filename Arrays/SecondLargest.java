import java.util.* ;
import java.io.*; 

class SecondLargest {

    public static void main(String[] args){
        int a[] = {8,2,4,8,4,6};
        System.out.println("Second Largest : "+findSecondLargest(a.length,a));
    }
    
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;

		for(int a : arr){

			if(a > largest){
			secondLargest = largest;
			largest = a;
			}

			if(a != largest && a > secondLargest)
			secondLargest = a;

		}
		
		if(secondLargest == Integer.MIN_VALUE) return -1;

		return secondLargest;

	}
}