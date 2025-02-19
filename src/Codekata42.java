/*
* 글자지우기
* 문자열 my_string과 정수 배열 indices가 주어질 때,
* my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata42 {
    static class Solution42 {
        public String solution42(String my_string, int[] indices) {
            String answer = "";
            // 1. my_string을 쉽게 접근할 수 있도록 문자열을 배열로
            String[] tmp = my_string.split("");

            //2. indices를 돌면서 지워야 할 값들을 비워둔다.
            for (int i = 0; i < indices.length; i++) {
                tmp[indices[i]] = "";
            }

            //3. 문자열을 하나로 합친다(빈 공간은 붙어도 어차피 포함X, 단순 "")
            for (String x : tmp) {
                answer += x;
            }
            return answer;
        }

        /*
        * 다른답변
          class Solution {
              public String solution(String my_string, int[] indices) {
                  StringBuilder sb = new StringBuilder(my_string);
                  for (int i : indices) {
                      sb.setCharAt(i, ' ');
                  }
                  return sb.toString().replace(" ", "");
              }
          }
        * */

        public static void main(String[] args){
            Solution42 sol42 = new Solution42();
            int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
            String result = sol42.solution42("apporoograpemmemprs", indices);
            System.out.println(result);
        }
    }
}
