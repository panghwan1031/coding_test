package programmers;

// 포켓몬

import java.io.IOException;
import java.util.HashSet;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class hash_02 {
    // 주어진 포켓몬 배열에서 최대한 다양한 종류의 포켓몬을 선택하는 메서드
    public int solution(int[] nums) {
        int answer = nums.length / 2; // 선택할 수 있는 최대 포켓몬 수 (배열 길이의 절반)
        HashSet<Integer> hs = new HashSet<>(); // 포켓몬 종류를 저장할 HashSet

        // 포켓몬 종류를 HashSet에 추가
        for (int n : nums) {
            hs.add(n);
        }

        // 선택할 수 있는 포켓몬 종류가 제한된 수(answer)보다 적거나 같은 경우
        if (answer >= hs.size()) {
            return hs.size(); // 선택 가능한 모든 종류의 포켓몬 수 반환
        } else {
            return answer; // 제한된 수만큼의 포켓몬 수 반환
        }
    }

    public static void main(String[] args) throws IOException {
        hash_02 h_02 = new hash_02(); // hash_02 클래스의 인스턴스를 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter를 사용하여 출력을 설정

        int[] nums1 = {3, 1, 2, 3}; // 첫 번째 테스트 케이스
        int[] nums2 = {3, 3, 3, 2, 2, 4}; // 두 번째 테스트 케이스
        int[] nums3 = {3, 3, 3, 2, 2, 2}; // 세 번째 테스트 케이스

        bw.write(h_02.solution(nums1) + "\n"); // 첫 번째 테스트 케이스의 결과를 BufferedWriter에 씀
        bw.write(h_02.solution(nums2) + "\n"); // 두 번째 테스트 케이스의 결과를 BufferedWriter에 씀
        bw.write(h_02.solution(nums3) + "\n"); // 세 번째 테스트 케이스의 결과를 BufferedWriter에 씀

        bw.flush(); // 버퍼를 비우고 출력
        bw.close(); // BufferedWriter를 닫음
    }
}
