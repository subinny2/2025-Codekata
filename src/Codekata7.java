/*
* 홀짝에 따라 다른 값 반환하기
* 양의 정수 n이 매개변수로 주어질 때,
* n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
*  n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata7 {
    static class Solution7 {
        public int solution7(int n) {
            int answer = 0;
            int[] num = new int[n];
            for(int i=0; i<n; i++){
                num[i] = i+1;
                if(n%2==1 && num[i]%2==1){// n이 홀수일 경우 홀수인 양의정수의 합
                        answer += num[i];
                } else if(n%2==0 && num[i]%2==0){ // n이 짝수면서 짝수만의 제곱의 합
                    answer += Math.pow(num[i],2);
                }
            }
            return answer;
        }

        /*
        * 개선된 코드
        * 배열에 넣을 필요없음 ㅠㅠ
        *  public int solution(int n) {
            int answer = 0;
            if (n % 2 == 0)
                for (int i = 2; i <= n; i += 2) answer += Math.pow(i, 2);
            else
                for (int i = 1; i <= n; i += 2) answer += i;
            return answer;
            }
        * */

        public static void main(String[] args){
            Codekata7.Solution7 sol7 = new Codekata7.Solution7();
            int result = sol7.solution7(10);
            System.out.println(result);
        }
    }
}
