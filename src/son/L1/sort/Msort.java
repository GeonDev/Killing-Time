package son.L1.sort;
import java.util.Arrays;

public class Msort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 2, 23, 45, 20, 5, 3};
		
		arr = sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
	
	public static int[] sort(int[] arr) {
		if(arr.length < 2) {
			return arr;
		}
		
		int mid = arr.length/2;
		int[] low_arr = sort(Arrays.copyOfRange(arr, 0, mid));
		int[] high_arr = sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		int[] mergedArr = new int[arr.length];
		
		int m = 0;
		int l = 0;
		int h = 0;
		
		while (l < low_arr.length && h < high_arr.length) {
			if(low_arr[l] < high_arr[h]) {
				mergedArr[m++] = low_arr[l++];
			}else {
				mergedArr[m++] = high_arr[h++];
			} 
		}
		
		while (l<low_arr.length ) {
			mergedArr[m++] = low_arr[l++];
		}
		
		while (h<high_arr.length ) {
			mergedArr[m++] = high_arr[h++];
		}
		
		return mergedArr;
	}

}
