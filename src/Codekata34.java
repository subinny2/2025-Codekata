/*
* 접미사인지 확인하기
* 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
* 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
* 문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata34 {
    static class Solution34 {
        public int solution34(String my_string, String is_suffix) {
            int answer = 0;
            String[] str = new String[my_string.length()]; // String배열 선언
            for(int i=0; i<my_string.length(); i++){
                str[i] = my_string.substring(i); //  접미사배열 만들기
                if(str[i].equals(is_suffix)){
                    return 1;
                }
            }
            return answer;
        }
        
        public static void main(String[] args){
            Solution34 sol34 = new Solution34();
            int result = sol34.solution34("banana","ana");
            System.out.println(result);
            
        }
    }
}
