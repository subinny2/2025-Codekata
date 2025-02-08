/*
* 문자열 뒤집기
* 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
* my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata37 {
    static class Solution37 {
        public String solution37(String my_string, int s, int e) {
            String answer = "";
            String subStr = my_string.substring(s,e+1); // 문자자르기
            StringBuffer sbStr = new StringBuffer(subStr);
            StringBuffer myStr = new StringBuffer(my_string);

            answer = String.valueOf(myStr.replace(s,e+1, String.valueOf(sbStr.reverse())));

            return answer;
        }

        /*
        * 코드 리팩토링
        * class Solution {
            public String solution(String my_string, int s, int e) {
                StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
                answer.reverse();
                return my_string.substring(0, s) + answer + my_string.substring(e + 1);
            }
        }
        * */

        public static void main(String[] args){
            Solution37 sol37 = new Solution37();
            String result = sol37.solution37("Progra21Sremm3", 6,12);
            System.out.println(result);
        }
    }
}
