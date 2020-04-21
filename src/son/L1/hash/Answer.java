package son.L1.hash;

public class Answer {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		String [] participant1 = {"mislav", "stanko", "mislav", "ana"};		
		String [] completion1 = {"stanko", "ana", "mislav"};
		
		System.out.println(Solution(participant1,completion1));
		

	}
	
	public static String Solution(String[] participant, String[] completion) {
		
		
		for(int i = 0; i<participant.length;i++) {
		
			
			for(int j = 0; j<completion.length;j++) {
				if(completion[j]!=null && participant[i]!=null && participant[i].equals(completion[j])) {				
					participant[i]=null;
					completion[j]=null;
				}
			}			
		}		
		
		for(String result : participant) {
			if(result !=null) {
				return result; 
			}			
		}
		
		return null;
	}
	

}
