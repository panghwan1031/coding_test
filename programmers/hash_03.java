package programmers;

//전화번호 목록

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
//import java.util.Map;
import java.util.HashSet;

public class hash_03 {
    public boolean solution01(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        boolean answer = true;
        for(String num : phone_book){
            map.put(num, 1);
        }

        for(String num : phone_book){
            for(int i = 0; i < num.length(); i++){
                if(map.containsKey(num.substring(0,i))){
                    answer = false;
                }
            }
        }
        return answer;
    }

    public boolean solution02(String[] phone_book){
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();
        for(String num : phone_book){
            hs.add(num);
        }
        for(String num : phone_book){
            for(int i = 1; i < num.length(); i++){
                if(hs.contains(num.substring(0, i))){
                    answer = false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        hash_03 h_03 = new hash_03();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] pb1 = {"119", "97674223", "1195524421"};
        String[] pb2 = {"123","456","789"};
        String[] pb3 = {"12","123","1235","567","88"};

        bw.write(Boolean.toString(h_03.solution02(pb3)));

        //bw.newLine();
        bw.flush();
        bw.close();
    }
}
