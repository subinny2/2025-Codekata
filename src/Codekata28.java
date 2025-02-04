/*
* 9로 나눈 나머지
* 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
* 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때,
* 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
* */
public class Codekata28 {
    static class Solution28{
        public int solution28(String number){
            int answer = 0;
            int num = 0;
            for(int i=0; i<number.length(); i++){
                num += Integer.parseInt(String.valueOf(number.charAt(i))); // 각 자리의 합
            }
            answer = num % 9;
            return answer;
        }
        /*
        * 다른답변 굳이 Integer.parseInt 쓸 필요가 없다.
        *  public int solution(String number) {
            int answer = 0;
            for(int i=0; i<number.length(); i++) {
                answer += number.charAt(i) - '0'; // 0을 빼주면 형변환 쓸 필요 없음
            }
            answer %= 9;
            return answer;
           }
        * */

        public static void main(String[] args){
            Solution28 sol28 = new Solution28();
//            int result = sol28.solution28("123");
            int result = sol28.solution28("78720646226947352489");
            System.out.println(result);
        }
    }
}
