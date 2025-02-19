import java.util.ArrayList;
import java.util.Arrays;

public class Codekata41 {
    static class Solution41 {
        public int[] solution41(int n, int k) {
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i=1; k*i<=n; i++){
                    answer.add(k*i);
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
        
        /*
        * 다른정답
            class Solution {
            public int[] solution(int n, int k) {
                int count = n / k;
                int[] answer = new int[count];
                for (int i = 1; i <= count; i++) {
                    answer[i - 1] = k * i;
                }
                return answer;
            }
        }
        * */

        public static void main(String[] args){
            Solution41 sol41 = new Solution41();
//            int[] result = sol41.solution41(10,3);
            int[] result = sol41.solution41(15,5);
            System.out.println(Arrays.toString(result));
        }
    }
}
