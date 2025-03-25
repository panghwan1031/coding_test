package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class day1 {


    //1037
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     String[] str = br.readLine().split(" ");
    //     int[] arr = new int[n];
    //     for(int i = 0 ; i < n; i++){
    //         arr[i] = Integer.parseInt(str[i]);
    //     }
    //     Arrays.sort(arr);
    //     System.out.println(arr[0] * arr[n - 1]);
    // }

    //1037
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     String[] str = br.readLine().split(" ");
    //     int Max = -1;
    //     int Min = Integer.MAX_VALUE;
    //     for(int i = 0; i < n; i++){
    //         int num = Integer.parseInt(str[i]);
    //         if(num > Max){
    //             Max = num;
    //         }
    //         if(num < Min){
    //             Min = num;
    //         }
    //     }
    //     System.out.println(Max * Min);
    // }

    //2748
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int n = Integer.parseInt(br.readLine());
    //     long f[] = new long[91];
    //     f[0] = 0; 
    //     f[1] = 1;
    //     for(int i = 2; i <= 90; i++){
    //         f[i] = f[i - 1] + f[i - 2];
    //     }
    //     System.out.println(f[n]);
    // }

    //10798
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     char[][] map = new char[5][15];
    //     for(int i = 0; i < 5; i++){
    //         String str = br.readLine();
    //         for(int j = 0; j < str.length(); j++){
    //             map[i][j] = str.charAt(j);
    //         }
    //     }
    //     for(int i = 0; i < 15; i++){
    //         for(int j = 0; j < 5; j++){
    //             if(map[j][i] != '\0'){
    //                 System.out.print(map[j][i]);
    //             }
    //         }
    //     }
    // }


    //1259
    // public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     while(true){
    //         String str = br.readLine();
    //         if(str.equals("0"))break;
    //         if(isP(str)){
    //             System.out.println("yes");
    //         }
    //         else{
    //             System.out.println("no");
    //         }
    //     }
    // }

    // private static boolean isP(String str){
    //     char[] arr = str.toCharArray();
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start <= end){
    //         if(arr[start] != arr[end]){
    //             return false;
    //         }
    //         start++;
    //         end--;
    //     }
    //     return true;
    // }
    
}
