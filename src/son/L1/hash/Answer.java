package son.L1.hash;

public class Answer {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		String [] participant1 = {"leo", "kiki", "eden"};		
		String [] completion1 = {"kiki", "eden"};
		
		System.out.println(Solution(participant1,completion1));
		

	}
	
	public static String Solution(String[] participant, String[] completion) {
		int temp = 0;
		
		for(int i = 0; i<participant.length;i++) {
			boolean b = true;
			
			for(int j = 0; j<completion.length;j++) {
				if(participant[i].equals(completion[j])) {				
						b=false;			
				}
			}
			if(b) {				
				temp = i;
			}
			
		}		
		return participant[temp];
	}
	

}
