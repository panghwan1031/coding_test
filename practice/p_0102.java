package practice;

import java.util.Arrays;

public class p_0102 {
    // private static int[] solution(int[] arr){
    //     Arrays.sort(arr);
    //     return arr;
    // }

    private static int[] solution(int[] arr){
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    public static void main(String[] args){
        int[] org ={4, 2, 3, 1, 5};
        int[] sorted = solution(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));
    }
}
