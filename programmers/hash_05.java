package programmers;

//베스트 앨범

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class hash_05 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> gpc = new HashMap<>(); // 각 장르의 총 재생 횟수를 저장하는 맵
        Map<String, List<int[]>> gs = new HashMap<>(); // 각 장르별 노래 리스트를 저장하는 맵

        // 장르별로 총 재생 횟수와 노래 리스트를 초기화
        for (int i = 0; i < genres.length; i++) {
            gpc.put(genres[i], gpc.getOrDefault(genres[i], 0) + plays[i]); // 장르별 총 재생 횟수를 누적
            gs.putIfAbsent(genres[i], new ArrayList<>()); // 해당 장르의 리스트가 없으면 새로 생성
            gs.get(genres[i]).add(new int[] { i, plays[i] }); // 해당 장르에 노래 추가 (노래의 고유 번호와 재생 횟수)
        }

        List<String> sortedg = new ArrayList<>(gs.keySet()); // 장르명을 리스트로 변환
        sortedg.sort((a, b) -> gpc.get(b) - gpc.get(a)); // 총 재생 횟수를 기준으로 장르를 내림차순 정렬

        List<Integer> ba = new ArrayList<>(); // 베스트 앨범에 수록할 노래의 고유 번호 리스트

        // 각 장르별로 가장 많이 재생된 두 곡을 선택
        for (String g : sortedg) {
            List<int[]> songs = gs.get(g); // 현재 장르의 노래 리스트를 가져옴
            songs.sort((a, b) -> { // 노래를 재생 횟수 내림차순으로 정렬 (재생 횟수가 같으면 고유 번호 오름차순)
                if (b[1] == a[1]) {
                    return a[0] - b[0];
                }
                return b[1] - a[1];
            });
            int count = 0; // 선택한 노래의 개수를 세기 위한 변수
            for (int[] song : songs) {
                ba.add(song[0]); // 베스트 앨범에 노래 추가
                count++;
                if (count == 2) // 최대 두 곡만 선택
                    break;
            }
        }

        // 리스트를 배열로 변환
        int[] answer = new int[ba.size()];
        for (int i = 0; i < ba.size(); i++) {
            answer[i] = ba.get(i);
        }

        return answer; // 베스트 앨범에 수록할 노래의 고유 번호 배열 반환
    }

    public static void main(String[] args) throws IOException {
        hash_05 h_05 = new hash_05();
        String[] genres = { "classic", "pop", "classic", "classic", "pop" }; // 입력 장르 배열
        int[] plays = { 500, 600, 150, 800, 2500 }; // 입력 재생 횟수 배열
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter를 사용하여 결과 출력
        bw.write(Arrays.toString(h_05.solution(genres, plays))); // 베스트 앨범 결과를 문자열로 변환하여 출력

        bw.flush(); // 버퍼에 남아 있는 데이터를 출력
        bw.close(); // BufferedWriter 닫기
    }
}
