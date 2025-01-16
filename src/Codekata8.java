/*
* 조건 문자열
* 두 수가 n과 m이라면
    ">", "=" : n >= m
    "<", "=" : n <= m
    ">", "!" : n > m
    "<", "!" : n < m
* 두 문자열 ineq와 eq가 주어집니다.
* ineq는 "<"와 ">"중 하나고,
* eq는 "="와 "!"중 하나입니다.
* 그리고 두 정수 n과 m이 주어질 때,
* n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
* */
public class Codekata8 {
    static class Solution8 {
        public int solution8(String ineq, String eq, int n, int m) {
            if(ineq.equals(">")){
                if(eq.equals("=")){
                    return n >= m ? 1 :0;
                } else if (eq.equals("!")){
                    return n > m ? 1: 0;
                }}

                if(ineq.equals("<")){
                    if(eq.equals("=")){
                        return n<=m ? 1 :0;
                    } else if (eq.equals("!")){
                        return n<m?1 :0;
                    }
                }
            return 0;
        }

        /*
        * 개선된 코드
        *  public int solution(String ineq, String eq, int n, int m) {
            boolean answer = false;
            if (ineq.equals(">") && eq.equals("="))
                answer = n >= m;
            else if (ineq.equals("<") && eq.equals("="))
                answer = n <= m;
            else if (ineq.equals(">") && eq.equals("!"))
                answer = n > m;
            else
                answer = n < m;
            return answer ? 1 : 0;
        }
        * */

        public static void main(String[] args){
            Codekata8.Solution8 sol8 = new Codekata8.Solution8();
            int result = sol8.solution8("<","=", 20, 50);
            System.out.println(result);
        }
    }
}
