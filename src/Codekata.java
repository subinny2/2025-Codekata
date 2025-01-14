public class Codekata {
    static class Solution {
        /*
        * 문자열 섞기
        * 내가 작성한코드
        * */
//        public String solution(String str1, String str2) {
//            String answer = "";
//                for(int i=0; i<str1.length(); i++){ // 두문자열의 합만큼 for문 돌림
//                    answer += str1.charAt(i) + "" + str2.charAt(i);
//                    System.out.println(answer);
//                }
//            return answer;
//        }


        /*
        * 문자열 섞기
        * 개선된 코드
        * 문제발생 : str1이 str2보다 문자열이 클때 IndexOutOfBoundsException발생
        * */

        public String solution(String str1, String str2) {
            StringBuilder answer = new StringBuilder(); // 문자열 연결에 효율적인 StringBuilder 사용
            int maxLength = Math.max(str1.length(), str2.length()); // 두 문자열 중 더 긴 길이

            for (int i = 0; i < maxLength; i++) {
                if (i < str1.length()) {
                    answer.append(str1.charAt(i)); // str1의 문자를 추가
                }
                if (i < str2.length()) {
                    answer.append(str2.charAt(i)); // str2의 문자를 추가
                }
            }
            return answer.toString();
        }


        public static void main(String[] args) {
            Solution sol = new Solution();
            String result = sol.solution("aaaaaaaaa", "bbbbbbbbbbbbbbb"); // 테스트할 값 입력
            System.out.println(result); // 결과 출력
        }
    }
}
