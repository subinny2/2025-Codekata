import java.util.Arrays;
/*
* 카운트 다운
* 정수 start_num와 end_num가 주어질 때,
* start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata43 {
    static class Solution43 {
        public int[] solution43(int start_num, int end_num) {
            int size = start_num - end_num + 1; // 배열 크기 계산
            int[] answer = new int[size];  // 크기가 지정된 배열 생성
            for (int i = 0; i < size; i++) { // `<=` 대신 `<` 사용
                answer[i] = start_num--;  // 값 할당
            }
            return answer;
        }

        public static void main(String[] args){
            Solution43 sol43 = new Solution43();
            int[] result = sol43.solution43(10,3);
            System.out.println(Arrays.toString(result));
        }
    }
}
