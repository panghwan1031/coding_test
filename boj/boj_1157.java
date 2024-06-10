package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        String s = br.readLine().toUpperCase();
        int max = -1;
        char result = '?';
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
            if (max < arr[s.charAt(i) - 'A']) {
                max = arr[s.charAt(i) - 'A'];
                result = s.charAt(i);
            } else if (max == arr[s.charAt(i) - 'A']) {
                result = '?';
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
