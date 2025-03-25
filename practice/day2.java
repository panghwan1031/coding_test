package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class day2 {

    //1924
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int sum = 0;
        for(int i = 0; i < x; i++){
            sum += month[i];
        }
        sum += y;
        System.out.println(day[sum % 7]);

    }

    //2309
    //     public static void main(String[] args)throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     int[] arr = new int[9];
    //     int sum = 0;
    //     for(int i = 0; i < 9; i++){
    //         arr[i] = Integer.parseInt(br.readLine());
    //         sum += arr[i];
    //     }
    //     Arrays.sort(arr);
    //     for(int i = 0 ; i < 9; i++){
    //         for(int j = i + 1; j < 9; j++){
    //             if(sum - arr[i] - arr[j] == 100){
    //                 for(int k = 0; k < 9; k++){
    //                     if(k != i && k != j){
    //                         System.out.println(arr[k]);
    //                     }
    //                 }
    //             }
    //         }
    //     }

    // }
}
