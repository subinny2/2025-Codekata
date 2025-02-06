public class Codekata35 {
    static class Solution35 {
        public String solution35(String my_string, int n) {
            String answer = "";
            answer = my_string.substring(0,n);
            return answer;
        }

        public static void main(String[] args){
            Solution35 sol35 = new Solution35();
            String result = sol35.solution35("ProgrammerS123", 11);
//            String result = sol35.solution35("He110W0r1d", 5);
            System.out.println(result);
        }
    }
}
