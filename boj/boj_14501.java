package boj;

//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_14501 {
    static int n;
    static int[][] s;
    static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        s = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            s[i][0] = Integer.parseInt(st.nextToken()); // 상담하는데 걸리는 일 수
            s[i][1] = Integer.parseInt(st.nextToken()); // 돈
        }

        r = 0;

        dfs(0, 0);

        bw.write(Integer.toString(r));

        bw.flush();
        bw.close();
    }

    static void dfs(int idx, int pay) {
        if (idx >= n) {
            r = Math.max(pay, r);
            return;
        }
        if (idx + s[idx][0] <= n) {
            dfs(idx + s[idx][0], pay + s[idx][1]);
        } else {
            dfs(idx + s[idx][0], pay);
        }

        dfs(idx + 1, pay);
    }
}