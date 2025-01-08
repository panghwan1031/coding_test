package practice;
//실패율

import java.io.*;
import java.util.*;
public class p_0108 {
    public int[] solution(int N, int[] stages){
        int[] challenger = new int[N + 2];
        for(int i = 0; i < stages.length; i++){
            challenger[stages[i]] += 1;
        }

        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        for(int i = 1; i  <= N; i++){
            if(challenger[i] == 0){
                fails.put(i, 0.);
            }else{
                fails.put(i, challenger[i]/ total);
                total -= challenger[i];
            }
        }
        return fails.entrySet()
        .stream().sorted((o1, o2) -> Double.compare(o2. getValue(), o1.getValue()))
        .mapToInt(HashMap.Entry::getKey).toArray();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] stages = new int[M];
        for(int i = 0; i < M; i++){
            stages[i] = Integer.parseInt(st.nextToken());
        }

        p_0108 obj = new p_0108();
        int[] result = obj.solution(N,stages);

        for(int stage : result){
            bw.write(stage + " ");
        }
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
