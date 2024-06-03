package boj;

import java.io.*;
import java.util.*;

//백준_27160 할리갈리
public class boj_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        Map<String, Integer> fc = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());
            
            // 현재 과일의 개수를 누적
            fc.put(fruit, fc.getOrDefault(fruit, 0) + cnt);
        }

        // 모든 카드를 처리한 후에 과일의 개수가 정확히 5인 경우를 체크
        for (String key : fc.keySet()) {
            if (fc.get(key) == 5) {
                bw.write("YES\n");
                bw.flush();
                bw.close();
                return;
            }
        }
        
        // 어떤 과일도 개수가 정확히 5개가 아니라면 "NO" 출력
        bw.write("NO\n");
        bw.flush();
        bw.close();
    }
}
