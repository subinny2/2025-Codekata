import java.util.ArrayList;
import java.util.Arrays;

/*
* 카운트 업
* 정수 start_num와 end_num가 주어질 때,
* start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata21 {
    static class Solution21 {
        public int[] solution21(int start_num, int end_num) {
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i = start_num; i<= end_num; i++){
                answer.add(i);
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }

        /* 다른답변
        * class Solution {
        * public int[] solution(int start, int end) {
        * int[] answer = new int[end-start+1];
        * int num = 0;
        * for(int i=start;i<=end;i++){
        *    answer[num] = i;
        *    num++;
        *   }
        *  return answer;
        *        }
        *    }
        * */

        public static void main(String[] args){
            Codekata21.Solution21 sol21 = new Codekata21.Solution21();
            int[] result = sol21.solution21(3,10);
            System.out.println(Arrays.toString(result));
        }
    }
}
