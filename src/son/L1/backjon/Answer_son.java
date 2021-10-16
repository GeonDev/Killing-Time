package son.L1.backjon;

public class Answer_son {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
	
		int []w = {0,6,4,3,5};
		int []v = {0,13,8,6,12};

		System.out.println(Solution(4,7,w,v));
		
	}
	
	public static int Solution(int n, int k, int[]w, int[]v) {
		
		int[][] dp = new int[n+1][k+1]; 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				dp[i][j] = dp[i-1][j]; // 기본적으로 이전 아이템의 가치를 저장한다.
				if(j - w[i]>=0) { // 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면,
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]); // 이전 아이템에서 구한 가치와 남은 무게의 가치 + 자신의 가치 중 큰 값을 취한다.
				}
			}
		}
		
		
		for(int i =0; i<n; i++) {			
			for(int j =0; j<k; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		
	
		
		return dp[n-1][k-1];
	}
	

}
