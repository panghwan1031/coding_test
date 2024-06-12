package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];

        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String str = Integer.toString(val);

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) - 48)]++;
        }
        for (int v : arr) {
            bw.write(Integer.toString(v));
            bw.newLine();
        }
        bw.flush();

        bw.close();

    }
}
