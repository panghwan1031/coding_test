package programmers;

// 완주하지 못한 선수 문제를 해결하는 코드

import java.util.Map;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class hash_01 {
    // 주어진 참가자 목록과 완주자 목록을 이용해 완주하지 못한 선수를 찾는 메서드
    public String solution(String[] particiant, String[] completion) {
        String answer = ""; // 결과를 저장할 변수

        HashMap<String, Integer> hm = new HashMap<>();
        // 참가자 목록을 순회하며 각 참가자의 이름과 그 수를 해시맵에 저장
        for (String p : particiant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1); // 해당 이름의 참가자 수를 1 증가시킴
        }
        // 완주자 목록을 순회하며 해시맵에서 해당 이름의 참가자 수를 1 감소시킴
        for (String p : completion) {
            hm.put(p, hm.get(p) - 1); // 해당 이름의 참가자 수를 1 감소시킴
        }
        // 해시맵을 순회하며 값이 0이 아닌 항목(완주하지 못한 참가자)을 찾음

        //entrySet사용
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey(); // 값이 0이 아닌 참가자의 이름을 결과로 설정
                break; // 결과를 찾으면 반복문을 종료
            }
        }
        return answer; // 완주하지 못한 참가자의 이름을 반환

        //keySet사용    
        // for (String key : hm.keySet()) {
        //     if (hm.get(key) != 0) {
        //         answer = key; // 값이 0이 아닌 참가자의 이름을 결과로 설정
        //         break; // 결과를 찾으면 반복문을 종료
        //     }
        // }
        // return answer; // 완주하지 못한 참가자의 이름을 반환
    }

    public static void main(String[] args) throws IOException {
        hash_01 h_01 = new hash_01(); // hash_01 클래스의 인스턴스를 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter를 사용하여 출력을 설정

        String[] participant1 = {"leo", "kiki", "eden"}; // 참가자 목록
        String[] completion1 = {"eden", "kiki"}; // 완주자 목록
        bw.write(h_01.solution(participant1, completion1) + "\n"); // solution 메서드를 호출하여 결과를 BufferedWriter에 씀
        
        bw.flush(); // 버퍼를 비우고 출력
        bw.close(); // BufferedWriter를 닫음
    }
}
