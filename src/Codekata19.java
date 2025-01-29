import java.util.Arrays;

public class Codekata19 {
    static class Solution19 {
        public int[] solution19(int[] arr, int[][] queries) {
            // 결과를 저장할 배열을 생성하고 -1로 초기화합니다.
            int[] answer = new int[queries.length];
            Arrays.fill(answer, -1);

            // 각 쿼리에 대해 반복합니다.
            for (int idx = 0; idx < queries.length; idx++) {
                int[] query = queries[idx];
                int s = query[0], e = query[1], k = query[2];

                // 주어진 범위 내에서 k보다 크면서 가장 작은 값을 찾습니다.
                for (int i = s; i <= e; i++) {
                    if (k < arr[i]) {
                        // 현재까지의 최솟값을 업데이트합니다.
                        answer[idx] = answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]);
                    }
                }
            }

            // 결과 배열을 반환합니다.
            return answer;
        }

        public static void main(String[] args){
            Codekata19.Solution19 sol19 = new Codekata19.Solution19();
            int[] arr = {0,1,2,4,3};
            int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
            System.out.println(sol19.solution19(arr,queries));

        }
    }
}
