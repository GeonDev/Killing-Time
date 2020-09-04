package son.L1.kakao1;

import java.util.ArrayList;
import java.util.List;

public class Answer_son {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answers = {1,3,4,5,3,2};
		Solution s = new Solution();
		   s.solution(answers);

	}

}
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> an = new ArrayList<Integer>();
        
        int a[] = {0,0,0};
   
        int bt= 0;
        int max= 0;
        
        for(int i =0; i<answers.length; i++){
        	
            if((i%5)+1 == answers[i]){
                a[0] +=1; 
            }
                
            if(i%2 == 0){
                if(answers[i] == 2){
                	a[1] +=1;
                }
            }else if(i%2 == 1){
            	bt++;
            	if(bt ==2) {
            		bt=3;
            	}
            	if(bt ==  answers[i]) {
            		a[1] +=1;
            		if(bt == 5) {
                		bt=0;
                	}
            	}            	
            } 
            
            
            if((i/2)%5 == 0) {
                if(answers[i] == 3){
                	a[2] +=1;
                } 
            }else if((i/2)%5 == 1) {
                if(answers[i] == 1){
                	a[2] +=1;
                }            	
            }else if((i/2)%5 == 2) {
            	if(answers[i] == 2){
                	a[2] +=1;
                }
            }else if((i/2)%5 == 3) {
            	if(answers[i] == 4){
                	a[2] +=1;
                }
            }else if((i/2)%5 == 4) {
            	if(answers[i] == 5){
                	a[2] +=1;
                }
            }            
        }    
        
        
        for(int t :a) {
        	if(max <= t) {
        		max = t;
        	}
        }
        
        for(int i =0;i<3;i++) {
        	if(a[i] == max) {
        	an.add(i+1);	
        	}        	
        }
        
        int[] ant = new int[an.size()];
        
        
        for(int i=0;i<an.size();i++) {
        	ant[i] = an.get(i);
        	System.out.print(ant[i]);
        }
        
        
        return ant;
    }
}