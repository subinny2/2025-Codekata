/*
* 문자열의 뒤의 n글자
* 문자열 my_string과 정수 n이 매개변수로 주어질 때,
* my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata32 {
    static class Solution32 {
        public String solution32(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(my_string.length()-n);
            return answer;
        }

        public static void main(String[] args){
            Solution32 sol32 = new Solution32();
//            String result = sol32.solution32("ProgrammerS123",11);
            String result = sol32.solution32("He110W0r1d",5);
            System.out.println(result);
        }
    }
}
