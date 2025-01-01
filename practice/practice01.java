package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class practice01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("input array : ");
        bw.flush();
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        int size = st.countTokens();
        int[] numbers = new int[size];
        int index = 0;
        while(st.hasMoreTokens()){
            numbers[index++] = Integer.parseInt(st.nextToken());
        }

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
        bw.write("최대값 " + maxValue + "\n");
        bw.write("인덱스 " + maxIndex + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}
