package programmers;

//의상

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class hash_04 {
    public int solution01(String[][] clothes){
        
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] c : clothes){
            if(!map.containsKey(c[1])){
                map.put(c[1],1);
            }else{
                map.put(c[1], map.get(c[1]) + 1);
            }
        }
        for(Integer value : map.values()){
            answer *= value + 1;
        }

        return answer - 1;
    }

    public int solution02(String[][] clothes){
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] c : clothes){
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        for(String key : map.keySet()){
            answer *= (map.get(key) + 1);
        }

        return answer - 1;

    }

    public static void main(String[] args)throws IOException{

        hash_04 h_04 = new hash_04();
        
        String[][] t1= {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] t2= {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write(String.valueOf(h_04.solution02(t1)));
        
        bw.flush();
        bw.close();
    }
}
