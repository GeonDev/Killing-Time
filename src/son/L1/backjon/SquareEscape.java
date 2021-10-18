package son.L1.backjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author son.geon
 * @link https://www.acmicpc.net/problem/1085
 */
public class SquareEscape {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        //최대 값 계산
        int min = 1000;

        min = Math.min(min, getDist(w,x,h,y));
        min = Math.min(min, getDist(0,x,0,y));
        min = Math.min(min, getDist(0,x,h,y));
        min = Math.min(min, getDist(w,x,0,y));

        min = Math.min(min, getDist(0,x,y,y));
        min = Math.min(min, getDist(x,x,0,y));

        min = Math.min(min, getDist(w,x,y,y));
        min = Math.min(min, getDist(x,x,h,y));


        System.out.println(min);


    }

    public static int getDist(int x1, int y1, int x2, int y2){
        return (int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

}
