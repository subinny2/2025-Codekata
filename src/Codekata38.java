import java.util.ArrayList;

/*
* 세로읽기
* 문자열 my_string과 두 정수 m, c가 주어집니다.
* my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을
* 문자열로 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata38 {
    static class Solution38 {
        public String solution38(String my_string, int m, int c) {
            String answer = "";
//            ArrayList<String> arr = new ArrayList<>();
//            for(int i =0; i<my_string.length(); i++){
//                arr.set(i, String.valueOf(my_string.charAt(i))); // 배열생성
//                answer += arr.get(i);

            for(int i=0; i<my_string.length(); i++){
                if(i%m == c-1){
                    answer += my_string.charAt(i);
                }
            }
            return answer;
        }

        /*
        * 다른 답안
        * public String solution(String my_string, int m, int c) {
            String answer = "";

            for (int i = c - 1; i < my_string.length(); i += m) {
                answer += my_string.charAt(i);
            }
            return answer;
          }
        * */

        public static void main(String[] args){
            Solution38 sol38 = new Solution38();
            String result = sol38.solution38("ihrhbakrfpndopljhygc", 4, 2);
            System.out.println(result);
        }
    }
}
