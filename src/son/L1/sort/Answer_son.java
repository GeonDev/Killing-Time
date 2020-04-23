package son.L1.sort;

import java.util.Arrays;

public class Answer_son {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array  = {1, 5, 2, 6, 3, 7, 4};
		int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
				
		printArray(Solution(array,commands));
	
;
	}
	
	
	public static int[] Solution(int[] array, int[][] commands) {
		int [] result = new int[commands.length];
		
		for(int i =0;i<commands.length;i++) {
			int[] order = commands[i];	
			
			int []temp = Arrays.copyOfRange(array, (order[0]-1), (order[1]));
			Arrays.sort(temp);			
			
			int num = order[2] -1;
			result[i] = temp[num];			
		}	
		
		return result;
	}
	
	
	public static void printArray(int[] array) {
		
		System.out.print("{");
		for(int i =0; i<array.length;i++) {
			if(i !=array.length-1) {
				System.out.print(array[i]+", ");
			}else{
				System.out.print(array[i]);
			}			
		}
		System.out.print("}");
		
	}
	

}
