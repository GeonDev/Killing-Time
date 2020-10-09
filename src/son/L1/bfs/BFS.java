package son.L1.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] graph = {{1,2},{0,3},{0,6,7,8},{1,4,5},{3},{3},{2},{2},{2,9},{8} };

		
		bfs(0,graph);

	}
	
	public static void bfs(int Start, int[][] graph) {
		
		Queue<Integer> unchecked = new LinkedList<Integer>();		
		List<Integer> checked = new ArrayList<Integer>();
		
		unchecked.offer(Start);
		
		while (!unchecked.isEmpty() ) {
			int node = unchecked.poll();
			checked.add(node);
			System.out.println("확인한 노드 : "+node);
			
			
			for(int i =0; i<graph[node].length; i++) {
				if(!checked.contains(graph[node][i]) ) {
					unchecked.offer(graph[node][i]);
				}
			}		
		}
		
	}

}
