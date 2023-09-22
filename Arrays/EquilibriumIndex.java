import java.util.* ;
import java.io.*; 
public class EquilibriumIndex {

	public static int arrayEquilibriumIndex(int[] arr){  

		int n = arr.length;
		int[] preSum = new int[arr.length];
		preSum[0] = arr[0];
		for(int i = 1; i<arr.length; i++) preSum[i] = preSum[i-1]+arr[i];

		for(int i = 0; i<arr.length; i++){
			if(preSum[i]-arr[i] == preSum[n-1]-preSum[i]) return i;
		}
		return -1;
	}
}