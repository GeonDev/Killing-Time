package son.L1.backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 백준 네번째 점
 * https://www.acmicpc.net/problem/3009  
 */
public class Four_Point {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> count = new HashMap<>();

        for(int i =0; i< 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j<2; j++){
                int key = Integer.parseInt(st.nextToken());
                if(count.containsKey(key )){
                    int val = count.get(key);
                    count.replace(key, val+1);
                }else{
                    count.put(key,1);
                }
            }
        }

        for (int key : count.keySet()) {
            if(count.get(key) != 2){
                System.out.println(count.get(key));
            }
        }










    }
}
