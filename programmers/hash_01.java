package programmers;

//완주하지 못한 선수

import java.util.Map;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class hash_01{
    public String solution(String[] particiant, String[] completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : particiant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        hash_01 h_01 = new hash_01();
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden" , "kiki"};
        bw.write(h_01.solution(participant1, completion1) + "\n");
        
        bw.flush();
        bw.close();
    }

}