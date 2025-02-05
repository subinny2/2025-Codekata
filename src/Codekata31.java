/*
* 부분 문자열 이어 붙여 문자열 만들기
* 1 ≤ my_strings의 길이 = parts의 길이 ≤ 100
* 1 ≤ my_strings의 원소의 길이 ≤ 100
* parts[i]를 [s, e]라 할 때, 다음을 만족합니다.
* 0 ≤ s ≤ e < my_strings[i]의 길이
* */
public class Codekata31 {
    static class Solution31 {
        public String solution31(String[] my_strings, int[][] parts) {
            String answer = "";
            String subStr = "";
            for(int i=0; i<my_strings.length; i++){
                    subStr = my_strings[i].substring(parts[i][0],parts[i][1]+1);
                answer += subStr;
            }

            return answer;
        }

        public static void main(String[] args){
            Solution31 sol31 = new Solution31();
            String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
            int[][] parts = {{0,4},{1,2},{3,5},{7,7}};
            String result = sol31.solution31(my_strings,parts);
            System.out.println(result);
        }
    }
}
