/*
* 더 크게 합치기
* 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
* 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
*  */
public class Codekata4 {
    static class Solution4 {
        public int solution4(int a, int b) {
            int answer = 0;
            int num1 = Integer.parseInt(a+""+b);
            int num2 = Integer.parseInt(b+""+a);
            if(num1>num2 || num1==num2){
                answer = num1;
            } else{
                answer = num2;
            }

            return answer;
        }

        public static void main(String[] args) {
            Codekata4.Solution4 sol4 = new Codekata4.Solution4();
            int result = sol4.solution4(9,91);
            System.out.println(result);
        }
    }
}
