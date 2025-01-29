import java.util.Arrays;

public class Codekata18 {
    static class Solution18 {
        public int[] solution18(int[] arr, int[][] queries) {
            int[] answer = new int[arr.length];
            for (int i = 0; i < queries.length; i++) {
                int n = arr[queries[i][1]];
                arr[queries[i][1]] = arr[queries[i][0]];
                arr[queries[i][0]] = n;
            }
            answer = Arrays.copyOf(arr, arr.length);
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
