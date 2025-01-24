import java.util.Arrays;

public class Codekata18 {
    static class Solution18 {
        public int[] solution18(int[] arr, int[][] queries) {
            int[] answer = new int[queries.length];
            Arrays.fill(answer, Integer.MAX_VALUE);

            for (int j = 0; j < queries.length; j++) {
                for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                    if (arr[i] > queries[j][2]) {
                        answer[j] = Math.min(answer[j], arr[i]);
                    }
                }
                if (answer[j] == Integer.MAX_VALUE) answer[j] = -1;
            }
            return answer;
        }

        public static void main(String[] args){
            Codekata18.Solution18 sol18 = new Codekata18.Solution18();
            int[] arr = {0,1,2,3,4};
            int[][] queries = {{0,3},{1,2},{1,4}};
            int[] result = sol18.solution18(arr,queries);
            System.out.println(result);
        }
    }
}
