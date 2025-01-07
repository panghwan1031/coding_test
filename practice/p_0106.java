package practice;

import java.util.Collections;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;


public class p_0106 {
    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = solution(arr);

        for(int num : result){
            bw.write(num + " ");
        }

        bw.newLine();
        bw.newLine();
        bw.flush();
        bw.close();

    }//
}

