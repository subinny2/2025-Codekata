/*
* 등차수열의 특정한 항만 더하기
* 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
* 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
* 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata10 {
    static class Solution10 {
        public int solution10(int a, int d, boolean[] included) {
            int answer = 0;
            int[] num = new int[included.length];

            // 등차수열 배열의 완성
            for(int i=0; i<num.length; i++){
                num[i] = a + d*i;
                if(included[i]==true){
                    answer += num[i];
                }
            }
            return answer;
        }

        /*
        * 개선된 방식 if문은 true flase로 판명나므로,
        *  public int solution(int a, int d, boolean[] included) {
                int answer = 0;

                for(int i = 0; i < included.length; i++){
                    if(included[i]){
                        answer +=  a + (d*i);
                    }
                }

                return answer;
            }
        * 굳이 배열에 넣지않고 더해준다.
        * */

        public static void main(String[] args){
            Codekata10.Solution10 sol10 = new Codekata10.Solution10();
            boolean[] included = {true, false, false, true, true};
            int result = sol10.solution10(3, 4, included);
            System.out.println(result);
        }
    }
}
