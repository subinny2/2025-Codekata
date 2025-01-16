/*
* 문자리스트를 문자열로 변환하기
* */
public class Codekata3 {
    static class Solution3 {
        public String solution3(String[] arr) {
            String answer = "";
            for(int i=0; i<arr.length; i++){
                answer += arr[i];
            }
            return answer;
        }

        public static void main(String[] args) {
            Codekata3.Solution3 sol3 = new Codekata3.Solution3();
            String[] arr = {"a","b","c"}; // Define the array
            String result = sol3.solution3(arr); // Pass the array and the value to search
            System.out.println(result); // Output the result
        }
    }
}
