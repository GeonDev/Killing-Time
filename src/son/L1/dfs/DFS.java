package son.L1.dfs;



public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] graph = {{1,2},{0,3},{0,6,7,8},{1,4,5},{3},{3},{2},{2},{2,9},{8} };
		boolean[] visited = new boolean[10];
		
		dfs(0,graph,visited);
	}
	
	public static void dfs(int Start, int[][]graph, boolean[]visited) {
		
		if(visited[Start]) {
			return;
		}else {
			visited[Start] = true;
			
			for(int i =0;i<graph[Start].length;i++) {
				int temp = graph[Start][i];
				
				if(!visited[temp]) {
					System.out.println(temp);
					dfs(temp, graph, visited);
				}
			}
			
		}
	}
    

}
