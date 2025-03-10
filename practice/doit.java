package practice;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class doit {
    // 숫자의 합 구하기
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     String sNum = sc.next();
    //     char[] cNum = sNum.toCharArray();
    //     int sum = 0;
    //     for (int i = 0; i < cNum.length; i++) {
    //         sum += cNum[i] - '0';
    //     }
    //     System.out.println(sum);
    // }

    // 평균 구하기
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int A[] = new int[N];
    //     for(int i = 0 ; i < N; i++){
    //         A[i] = sc.nextInt();
    //     }
    //     long sum = 0;
    //     long max = 0;

    //     for(int i = 0; i < N; i++){
    //         if(A[i] > max){
    //             max = A[i];
    //         }
    //         sum = sum + A[i];
    //     }
    //     System.out.println(sum * 100.0/max/N);
    // }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int qNo = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        long[]S = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++){
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int q = 0; q < qNo; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(S[j] - S[i - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
