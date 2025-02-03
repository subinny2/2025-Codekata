import java.util.Arrays;

/*
* 수열과 구간 쿼리4
* 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
* queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
* 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
* 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
* */
public class Codekata25 {
    static class Solution25 {
        public int[] solution25(int[] arr, int[][] queries) {
            for(int i=0; i< queries.length; i++){
                for(int j=queries[i][0]; j<= queries[i][1]; j++){
                    if(j%queries[i][2]==0){
                        arr[j]++;
                    }
                }
            }
            return arr;
        }

        public static void main(String[] args){
            Solution25 sol25 = new Solution25();
            int[] arr = {0, 1, 2, 4, 3};
            int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
            int[] result = sol25.solution25(arr, queries);
            System.out.println(Arrays.toString(result));
        }
    }
}
