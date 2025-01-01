package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class practice02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("input array : ");
        bw.flush();
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input, " ");
        Set<Integer> set = new HashSet<>();
        //int size = st.countTokens();
        //int[] numbers = new int[size];
        //int index = 0;
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        Integer[] numbers = set.toArray(new Integer[0]);
        Arrays.sort(numbers);

        if(numbers.length <2){
            bw.write("there is no seconde nubmer");
        }else{
            bw.write("second number : " + numbers[numbers.length - 2] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
