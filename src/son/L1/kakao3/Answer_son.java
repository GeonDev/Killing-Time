package son.L1.kakao3;

import java.util.*;

public class Answer_son {

	public static void main(String[] args) {


		
	}

}

class Solution {
    public int[] solution(int N, int[] stages) {
       int[] answer = {};       
    
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
       
   	List<Integer> keySetList = new ArrayList<>(m.keySet());
	
   	Collections.sort(keySetList, (o1, o2) -> (m.get(o2).compareTo(m.get(o1))));
       
       return answer;
   }
}
