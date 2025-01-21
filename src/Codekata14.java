/*
* 이어 붙인 수
* 정수가 담긴 리스트 num_list가 주어집니다.
* num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata14 {
    static class Solution14{
        public int solution(int[] num_list) {
            int answer = 0;
            String num1 = "";
            String num2 = "";
            for(int i=0; i<num_list.length; i++){
                if(num_list[i]%2==1){ // 원소가 홀수이면
                    num1 += num_list[i] + "";
                } else{
                    num2 += num_list[i] + "";
                }

            }
            answer = Integer.parseInt(num1) + Integer.parseInt(num2);
            return answer;
        }

        public static void main(String[] args){
            Codekata14.Solution14 sol14 = new Codekata14.Solution14();
//            int[] num_list = {3,4,5,2,1};
             int[] num_list = {5,7,8,3};
            int result = sol14.solution(num_list);
            System.out.println(result);
        }
    }
}
