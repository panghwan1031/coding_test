package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int p[] = new int[21];
        p[0] = 0;
        p[1] = 1;
        for (int i = 2; i < 21; i++) {
            p[i] = p[i - 1] + p[i - 2];
        }
        bw.write(Integer.toString(p[n]));
        bw.flush();
        bw.close();
    }
}
