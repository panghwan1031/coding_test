package practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
정적 배열, 동적 배열

정적 배열은 배열의 크기가 고정되어 있어서 크기를 변경할 수 없다.
동적 배열은 배열의 크기를 변경할수 있다.

동적 배열은 ArrayList 클래스 사용

Collections.reverseOrder() : 내림차순 정렬을 쓰기 위해서는 int가 아닌 Integer로 사용해야한다.
*/

public class javact {

    public static void main(String[] args){
        //javact p = new javact();

        javact.p1();
    }
    
    public static void p1(){
        Integer a[] = {1, 3, 2, 1, 5};
        //Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static void p2(){
        int a[] = new int[5];

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }



    class Pair{
        int y;
        int x;
        
    }
}
