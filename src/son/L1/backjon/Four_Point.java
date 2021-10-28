package son.L1.backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 네번째 점
 * https://www.acmicpc.net/problem/4153
 */
public class Four_Point {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> arr = new ArrayList<>();
            arr.add(Integer.parseInt(st.nextToken()));
            arr.add(Integer.parseInt(st.nextToken()));
            arr.add(Integer.parseInt(st.nextToken()));

            Collections.sort(arr);

            if(arr.get(0) == 0 && arr.get(1) == 0 && arr.get(2) == 0){
                break;
            }

            if(Math.sqrt(Math.pow(arr.get(0),2) + Math.pow(arr.get(1),2)) == arr.get(2) ){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}
