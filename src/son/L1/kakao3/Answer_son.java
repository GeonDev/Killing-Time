package son.L1.kakao3;

import java.util.*;

public class Answer_son {

	public static void main(String[] args) {


		
	}

}

class Solution {
    public int[] solution(int N, int[] stages) {
       int[] answer = {};
       
       List<String> tempList = new ArrayList<String>();
       
       Map<Integer,Integer> m = new HashMap<Integer, Integer>();
       
       
       for(int i = 1; i<= N; i++) {
       	m.put(i,0);        	
       }
       
       for(int c: stages) {
       	int temp =  m.get(c);
       	temp++;        	
       	m.remove(c);
       	m.put(c, temp);
       }
       
       for(int j =1; j<=m.size(); j++) {
       	tempList.add(j+","+m.get(j));
       }        
       
       return answer;
   }
}
