package son.L1.sort2;

public class Qsort {

	public static void main(String[] args) {
			int []a = {1,6,9,3,2,8};	
			
			qsort(a, 0, a.length-1);
			
			for(int i : a) {
				System.out.println(i);
			}

	}
	
	public static int patition(int[] list , int left, int right) {
		int p = list[(left+right)/2];
		
		while (left < right) {
			while (list[left] < p && (left<right)) {
				left++;
			}
			while (list[right] > p && (left<right)) {
				right--;
			}
			
			if(left < right) {
				int temp = list[left];
				list[left] = list[right];
				list[right] = temp;
			}			
		}		
		return left;
	}
	
	public static void qsort(int arr[], int left, int right) {
		
		if(left <right) {
			int pivotNum = patition(arr, left, right);
			
			qsort(arr, left, pivotNum-1);
			qsort(arr, pivotNum+1, right);
			}	
	}
	
	
	
	

}
