package practice;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

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

    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     int suNo = Integer.parseInt(st.nextToken());
    //     int qNo = Integer.parseInt(st.nextToken());
    //     StringBuilder sb = new StringBuilder();
    //     long[]S = new long[suNo + 1];
    //     st = new StringTokenizer(br.readLine());
    //     for(int i = 1; i <= suNo; i++){
    //         S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
    //     }
    //     for(int q = 0; q < qNo; q++){
    //         st = new StringTokenizer(br.readLine());
    //         int i = Integer.parseInt(st.nextToken());
    //         int j = Integer.parseInt(st.nextToken());
    //         sb.append(S[j] - S[i - 1]).append("\n");
    //     }
    //     System.out.println(sb);
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int cnt = 1;
    //     int s_i = 1;
    //     int e_i = 1;
    //     int sum = 1;
    //     while(e_i != N){
    //         if(sum == N){
    //             cnt++; 
    //             e_i++;
    //             sum = sum + e_i;
    //         }else if(sum > N){
    //             sum = sum - s_i;
    //             s_i++;
    //         }else{
    //             e_i++;
    //             sum = sum + e_i;
    //         }
    //     }
    //     System.out.println(cnt);
    // }

    //주몽의 명령
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int N = Integer.parseInt(br.readLine());
    //     int M = Integer.parseInt(br.readLine());
    //     int[] A = new int[N];
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     for(int i = 0 ; i < N; i++){
    //         A[i] = Integer.parseInt(st.nextToken());
    //     }
    //     Arrays.sort(A);
    //     int cnt = 0;
    //     int i = 0;
    //     int j = N - 1;
    //     while(i < j){
    //         if(A[i] + A[j] < M) i++;
    //         else if(A[i] + A[j] > M)j--;
    //         else{
    //             cnt++;
    //             i++;
    //             j--;
    //         }
    //     }
    //     System.out.println(cnt);
    // }

    // //슬라이딩 윈도우
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // }

    //DFS
    //재귀함수
    //스택 자료구조 이용

    //연결 요소의 개수 구하기

    // static boolean v[];
    // static ArrayList<Integer>[] A;
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     int n = Integer.parseInt(st.nextToken());
    //     int m = Integer.parseInt(st.nextToken());

    //     v = new boolean[n + 1];
    //     A = new ArrayList[n + 1];
    //     for(int i = 1; i < n + 1; i++){
    //         A[i] = new ArrayList<Integer>();
    //     }
    //     for(int i = 0 ; i < m; i++){
    //         st = new StringTokenizer(br.readLine());
    //         int s = Integer.parseInt(st.nextToken());
    //         int e = Integer.parseInt(st.nextToken());
    //         A[s].add(e);
    //         A[e].add(s);
    //     }
    //     int cnt = 0;
    //     for(int i = 1; i < n + 1; i++){
    //         if(!v[i]){
    //             cnt++;
    //             dfs(i);
    //         }
    //     }
    //     System.out.println(cnt);
    // }
    // private static void dfs(int i){
    //     if(v[i]){
    //         return;
    //     }
    //     v[i] = true;
    //     for(int j : A[i]){
    //         if(!v[j]){
    //             dfs(j);
    //         }
    //     }
    // }

    //DFS 우선순회
    private static ArrayList<Integer>[] adjList;
    
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    private static int[] solution(int[][] graph, int start, int n){
        adjList = new ArrayList[n + 1];
        for(int i = 0; i < adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }
        for(int[] edge : graph){
            adjList[edge[0]].add(edge[1]);
            // adjList[edge[1]].add(edge[0]);
        }
        visited = new boolean[ n + 1 ];
        answer = new ArrayList<>();
        dfs(start);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int now){
        visited[now] = true;
        answer.add(now);

        for(int next : adjList[now]){
            if(!visited[next])dfs(next);
        }
    }

    public static void main(String[] args){
        int[][] graph = {
            {1, 2},
            {1, 3},
            {2, 4},
            {2, 5},
            {3, 6},
            {5, 6},
            // {4, 8},
            // {5, 9},
            // {5, 10},
            // {6, 11},
            // {6, 12},
            // {9, 13},
            // {10, 14},
            // {12, 15}
        };
        int[] result = solution(graph, 1, 6);
        for(int i : result){
            System.out.print(i + " ");
    }
    }

    // static boolean[] v;
    // static int[][] arr;
    // static int cnt = 0;

    // static int n, m;

    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     n = Integer.parseInt(st.nextToken());
    //     m = Integer.parseInt(st.nextToken());
        
    //     arr = new int[n + 1][n + 1];
    //     v = new boolean[n + 1];

    //     for(int i = 0; i < m; i++){
    //         st = new StringTokenizer(br.readLine());

    //         int a = Integer.parseInt(st.nextToken());
    //         int b = Integer.parseInt(st.nextToken());
            
    //         arr[a][b] = arr[b][a] = 1;
    //     }
    //     dfs(1);

    //     System.out.println(cnt - 1);
    // }
    // public static void dfs(int start){
    //     v[start] = true;
    //     cnt++;

    //     for(int i = 0; i <= n; i++){
    //         if(arr[start][i] == 1 && !v[i])
    //         dfs(i);
    //     }
        
    // }

    // static boolean[] v;
    // static int[][] arr;
    // static int cnt = 0;
    // static int n, m;

    // public static void main(String[] args) throws IOException {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     n = Integer.parseInt(st.nextToken()); // 전역 변수 사용
    //     m = Integer.parseInt(st.nextToken()); // 전역 변수 사용

    //     arr = new int[n + 1][n + 1];
    //     v = new boolean[n + 1];

    //     for (int i = 0; i < m; i++) {
    //         st = new StringTokenizer(br.readLine());
    //         int a = Integer.parseInt(st.nextToken());
    //         int b = Integer.parseInt(st.nextToken());
    //         arr[a][b] = arr[b][a] = 1;
    //     }

    //     dfs(1);
    //     System.out.println(cnt - 1);  // 논리 확인 필요
    // }

    // public static void dfs(int start) {
    //     v[start] = true;
    //     cnt++;

    //     for (int i = 1; i <= n; i++) { // 0이 아니라 1부터 시작
    //         if (arr[start][i] == 1 && !v[i]) {
    //             dfs(i);
    //         }
    //     }
    // }
}
