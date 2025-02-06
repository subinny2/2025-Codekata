/*
* 접두사인지 확인하기
* 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다.
* 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
* 문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata36 {
    static class Solution36 {
        public int solution36(String my_string, String is_prefix) {
            int answer = 0;
            String[] str = new String[my_string.length()]; // 접두사를 담을 배열
            for(int i =0; i<my_string.length(); i++){
                str[i] = my_string.substring(0,i);
                System.out.println(str[i]);
                if(str[i].equals(is_prefix)){
                    return 1;
                }
            }
            return answer;
        }

        public static void main(String[] args){
            Solution36 sol36 = new Solution36();
            int result = sol36.solution36("banana","ban");
            System.out.println(result);
        }
    }
}
