package son.L1.permute;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 3;
	     int[] arr = {1, 2, 3};
	     int[] output = new int[n];
	     boolean[] visited = new boolean[n];

	     permutate(arr,0,n,3);
	     
	     //powerSet(arr, visited, 0);
	}
	
	
	
	

	public static void powerSet(int[] arr, boolean[] visited ,int k) {
		if(k == arr.length) {
			for(int i = 0; i<visited.length; i++) {
				if(visited[i] == true) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}else {
			visited[k] = true;
			powerSet(arr, visited, k+1);
			
			visited[k] = false;
			powerSet(arr, visited, k+1);
		}	
		
	}
	

	
	
	public static void permutate(int []arr, int depth, int n, int r) {
	
		if(depth == r) {
			print(arr, r);
			return;
		}
		
		for(int i = depth; i<n; i++) {
			swap(arr,depth,i);
			permutate(arr, depth+1, n, r);
			swap(arr,depth,i);			
		}
	}
	
	static void swap(int[] arr, int depth , int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;		
    }
	
	
	
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}


