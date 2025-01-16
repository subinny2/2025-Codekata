/*
* n의배수
* 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면
* 0을 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata5 {
    static class Solution5 {
        public int solution5(int num, int n) {
            int answer = 0;
            if(num % n == 0){ //n의 배수일경우
                answer = 1;
            } else{
                answer = 0;
            }
            return answer;
        }

        /*
        * 개선된 코드
        *  public int solution(int num, int n) {
            int answer = num % n == 0 ? 1 : 0;
            return answer;
        }
        * */

        public static void main (String[] args) {
            Codekata5.Solution5 sol5 = new Codekata5.Solution5();
            int result = sol5.solution5(2,1);
            System.out.println(result);

        }
    }
}
