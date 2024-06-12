package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long fixedCost = Long.parseLong(st.nextToken());
        long vc = Long.parseLong(st.nextToken());
        long price = Long.parseLong(st.nextToken());

        if (vc >= price) {
            bw.write("-1\n");
        } else {
            long bep = (fixedCost / (price - vc)) + 1;
            bw.write(bep + "\n");
        }

        bw.flush();
        bw.close();
    }
}
