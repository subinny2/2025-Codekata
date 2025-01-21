/*
* 원소들의 곱과 합
* 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata13 {
    static class Solution13 {
        public int solution13(int[] num_list) {
            int answer = 0;
            int sum1 = 1; // 곱셈의 초기화는 1
            int sum2 = 0;

            for(int i=0; i<num_list.length; i++) {
                sum1 *= num_list[i];
                sum2 += num_list[i];
            }
            if(sum1<Math.pow(sum2,2)){
                answer = 1;
            } else{
                answer = 0;
            }

            return answer;
        }

        public static void main(String[] args){
            Codekata13.Solution13 sol13 = new Codekata13.Solution13();
             int[] num_list = {3,4,5,2,1};
//            int[] num_list = {5,7,8,3};
            int result = sol13.solution13(num_list);
            System.out.println(result);
        }
    }
}
