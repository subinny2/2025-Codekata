/*
* flag에 따라 다른 값 반환하기
* 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때,
* flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata9 {
    static class Solution9 {
        public int solution9(int a, int b, boolean flag) {
            int answer = 0;
            answer = flag == true ? a+b : a-b;
            return answer;
        }

        /*
        * 개선된 코드
        * flag == true를 굳이 안해도 됨..!!!!!!
        * public int solution(int a, int b, boolean flag) {
            return flag ? a + b : a - b;
        }
        * */

        public static void main(String[] args){
            Codekata9.Solution9 sol9 = new Codekata9.Solution9();
//            int result = sol9.solution9(-4, 7, true);
            int result = sol9.solution9(-4, 7, false);
            System.out.println(result);
        }
    }
}
