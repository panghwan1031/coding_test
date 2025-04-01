package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class day4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int A[] = new int[N];
        int high = 0; 
        int low = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N;  i++){
            A[i] = Integer.parseInt(st.nextToken());
            high = Math.max(high, A[i]);
        }
        while(high >= low){
            int mid = (high + low) / 2;
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(A[i] > mid){
                    sum += A[i] - mid;
                }
            }
            if(sum >= M){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(high);

    }
}
