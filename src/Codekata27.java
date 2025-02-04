import java.util.ArrayList;

/*
* 글자 이어 붙여 문자열 만들기
* 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
* my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata27 {
    static class Solution27{
        public String solution27(String my_string, int[] index_list){
            String answer = "";
            int index = 0;

            for(int i=0; i<index_list.length; i++){
                index = index_list[i]; // 찾을 인덱스번호
                answer += my_string.charAt(index);
            }
            return answer;
        }

        public static void main(String[] args){
            Solution27 sol27 = new Solution27();
            int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
            String result = sol27.solution27("cvsgiorszzzmrpaqpe",index_list);
            System.out.println(result);
        }
    }
}
