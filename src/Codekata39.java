/*
* qr code
* 두 정수 q, r과 문자열 code가 주어질 때,
* code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata39 {
    static class Solution39 {
        public String solution39(int q, int r, String code) {
            String answer = "";
            for(int i=0; i<code.length(); i++){
                if(i%q==r){
                    answer += code.charAt(i);
                }
            }
            return answer;
        }

        /*
        * 다른답안
        * public String solution(int q, int r, String code) {

            StringBuilder sb = new StringBuilder();

            for (int i = r; i < code.length(); i += q)
                sb.append(code.charAt(i));

            return sb.toString();
    }
        * */

        public static void main(String[] args){
            Solution39 sol39 = new Solution39();
            String result = sol39.solution39(3,1, "qjnwezgrpirldywt");
            System.out.println(result);
        }
    }
}
