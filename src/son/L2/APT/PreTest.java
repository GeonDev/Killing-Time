package son.L2.APT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PreTest {

	 static int[][]map;
	 static int N,cnt;
	 static int[][]visited;
	 static int dx[] = {-1,1,0,0};
	 static int dy[] = {0,0,-1,1};
	    
	 static List<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        
	        N = scan.nextInt();
	        
	        map = new int[N][N];
	        visited = new int[N][N];
	        
	        for(int i=0;i<N;i++){
	            String input = scan.next();
	            for(int j=0;j<N;j++)
	            {
	             map[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
	            }
	        }
	        
	        
	        
	        for(int i=0;i<N;i++) {
	            for(int j=0;j<N;j++)      
	            	//현재 맵이 찾으려는 값 "1"이고 방문을 안했다면
	                if(map[i][j] == 1 && visited[i][j] == 0)    
	                {
	                    cnt = 1;
	                    find(i,j);
	                    al.add(cnt);
	                }
	        }
	        
	        Collections.sort(al);
	        
	        //그룹의 개수
	        System.out.println(al.size());
	        //개별 그룹의 크기
	        for(int i=0;i<al.size();i++) {
	        	System.out.println(al.get(i));
	        }
	            
	}
	
	public static int find(int x, int y){
	        visited[x][y] = 1;
	        
	        for(int i=0;i<4;i++)
	        {
	        int nx = x+dx[i];
	        int ny = y+dy[i];
	        
	        if(nx>=0 && ny>=0 && nx<N && ny<N) {
	                if(map[nx][ny] == 1 && visited[nx][ny] == 0)
	                {
	                    find(nx,ny);
	                    cnt++;
	                }
	            }
	        }
	        return cnt;
	    }

}
