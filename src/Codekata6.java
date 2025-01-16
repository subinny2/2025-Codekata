/*
* 공배수
* 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata6 {
    static class Solution6 {
        public int solution6(int number, int n, int m) {
            int answer = 0;
            answer = (number % n ==0 && number %m==0) ? 1 : 0;
            return answer;
        }

        public static void main(String[] args){
            Codekata6.Solution6 sol6 = new Codekata6.Solution6();
            int result = sol6.solution6(60,2,3);
            System.out.println(result);
        }
    }
}
