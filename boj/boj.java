package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class boj {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            if(a == 0 && b == 0 && c == 0){
                break;
            }

            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;
            int otherSum = sum - max;

            if(max >= otherSum){
                bw.write("Invalid\n");
                continue;
            }
            if(a == b && b == c){
                bw.write("Equilateral\n");
            }else if(a == b || b == c || a == c){
                bw.write("Isosceles\n");
            }else{
                bw.write("Scalene\n");
            }
        }

    }
}
