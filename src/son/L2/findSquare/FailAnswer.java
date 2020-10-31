package son.L2.findSquare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FailAnswer {

	
	
    public int solution(int [][]board){
        int answer = 0;
        
        int n = board.length;
        int m = board[0].length;
        
        int max = Math.min(n, m);
        
        for(int i =0; i< n; i++) {
        	for(int j = 0; j< m; j++) {
        		
        		if((i+max) < n && (j+max) < m ) {        			
        			if(istrue(i, j, max, board)) {    
        				return max*max;
        			}
        		}        		
        	}
        	max--;
        }
        return answer;
    }
    
    
	public boolean istrue(int Startx, int Starty, int N, int [][]board) {
		
		for(int i = Startx; i<Startx+N; i++) {
			for(int j = Starty; j<Starty+N; j++) {
				
				if(board[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
	

}
