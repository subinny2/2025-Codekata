/*
* 주사위 게임
* 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다.
* 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
* 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
* 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
* 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
* 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata12 {
    static class Solution12 {
        public int solution12(int a, int b, int c) {
            int answer = 0;
            int num1 = a+b+c;
            int num2 = (int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
            int num3 = (int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            if(a!=b && a!=c && b!=c){
                answer = a+b+c;
            }else if(a==b && a==c && b==c){
                answer = num1 * num2 * num3;
            } else {
                answer = num1 * num2;
            }
            return answer;
        }

        public static void main(String[] args){
            Codekata12.Solution12 sol12 = new Codekata12.Solution12();
            int result = sol12.solution12(4,4,4);
            System.out.println(result);
        }
    }
}
