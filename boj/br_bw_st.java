package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class br_bw_st {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // String s = br.readLine();
        // int T = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        // int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st;

        // StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a + b;
        }
        bw.write(Integer.toString(sum));
        bw.newLine();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < sum; i++) {
            // if (st.hasMoreTokens()) {
            bw.write(st.nextToken());
            bw.newLine();
            // }
        }
        bw.flush();
        bw.close();
    }

}
