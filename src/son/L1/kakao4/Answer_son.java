package son.L1.kakao4;

import java.util.*;

public class Answer_son {

	public static void main(String[] args) {

		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		Solution solution = new Solution();
		solution.solution(s);
		
		
	}

}

class Solution {
    public int[] solution(String s) {
    	String temp = s.substring(2, s.length()-2);
    	System.out.println(temp);
    	
    	String[] tempList = temp.split("\\},\\{");
    	
    	Map<Integer, Integer> keyList = new HashMap<Integer, Integer>();   	
    	
    	for(String t : tempList) {
    		String[] keys = t.split(",");
    		
    		for(String t1 : keys) {    			
    			if(keyList.get(Integer.parseInt(t1)) != null) {
    				int tempCount = keyList.get(Integer.parseInt(t1))+1;
    				keyList.remove(Integer.parseInt(t1));
    				keyList.put(Integer.parseInt(t1), tempCount);
    			}else {
    				keyList.put(Integer.parseInt(t1), 1);
    			}
    		}    		
    	}
    	
    	List<Integer> keySetList = new ArrayList<>(keyList.keySet());
    	
    	Collections.sort(keySetList, (o1, o2) -> (keyList.get(o2).compareTo(keyList.get(o1))));
    	
    	int [] answer = new int[keyList.size()];
    	
    	for(int i =0;i<keyList.size(); i++) {
    		answer[i] = keySetList.get(i);    	
    	}
    	        
        return answer;
    }
}

