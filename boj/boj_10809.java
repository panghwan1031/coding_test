package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] text = br.readLine().toCharArray();

        for (int i = 0; i < 26; i++) {
            int temp = -1;
            for (int j = 0; j < text.length; j++) {
                if (text[j] - 'a' == i) {
                    temp = j;
                    break;
                }
            }
            bw.write(Integer.toString(temp) + " ");
        }
        bw.flush();
        bw.close();
    }

}
