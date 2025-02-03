/*
* 간단한 논리 연산
* boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때,
* 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata24 {
    static class Solution24 {
        public boolean solution24(boolean x1, boolean x2, boolean x3, boolean x4) {
            boolean answer = (x1 || x2) && (x3 || x4);
            return answer;
        }

        public static void main(String[] args){
            Solution24 sol24 = new Solution24();
//            boolean result = sol24.solution24(false, true, true, true);
            boolean result = sol24.solution24(true, false, false, false);

            System.out.println(result);
        }
    }
}
