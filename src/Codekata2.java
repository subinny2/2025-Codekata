/*
* 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.
* */

public class Codekata2 {
    static class Solution2 {
        public int solution2(int[] num_list, int n) {
            int answer = 0;
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] == n) {
                    return 1;
                }else {
                    answer = 0;
                }
            }
            return answer;
        }

        public static void main(String[] args) {
            Solution2 sol2 = new Solution2();
            int[] numList = {1, 2, 3, 4, 5}; // Define the array
            int result = sol2.solution2(numList, 3); // Pass the array and the value to search
            System.out.println(result); // Output the result
        }
    }
}

