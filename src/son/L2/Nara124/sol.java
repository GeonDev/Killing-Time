package son.L2.Nara124;

/**
 * @author son.geon
 * @link https://programmers.co.kr/learn/courses/30/lessons/12899
*/
public class sol {
	
    public String solution(int n) {
        String answer = "";
        
        while (n >0) {
			if(n%3 == 0) {
				answer = "4" + answer;				
				n= n/3;  
				n--;
			}else {
				answer = (n%3)+answer;
				n= n/3;  
			}
		}
        
        return answer;
    }

}
