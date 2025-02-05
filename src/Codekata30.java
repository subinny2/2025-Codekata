import java.util.ArrayList;
import java.util.Arrays;

/*
* 배열 만들기5
* 문자열 배열 intStrs와 정수 k, s, l가 주어집니다. intStrs의 원소는 숫자로 이루어져 있습니다.
* 배열 intStrs의 각 원소마다 s번 인덱스에서 시작하는 길이 l짜리 부분 문자열을 잘라내 정수로 변환합니다.
* 이때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return 하는 solution 함수를 완성해 주세요.
* */
public class Codekata30 {
    static class Solution30 {
        public int[] solution30(String[] intStrs, int k, int s, int l) {
            ArrayList<Integer> answer = new ArrayList<>();
            int strNum = 0;
            for(int i=0; i<intStrs.length; i++){
                strNum = Integer.parseInt(intStrs[i].substring(s,s+l)); // 자른숫자
                if(strNum>k){
                    answer.add(strNum);
                }
            }
            return answer.stream().mapToInt(Integer::intValue).toArray();
        }

        public static void main(String[] args){
            Solution30 sol30 = new Solution30();
            String[] intStrs = {"0123456789","9876543210","9999999999999"};
            int[] result = sol30.solution30(intStrs, 50000, 5, 5 );
            System.out.println(Arrays.toString(result));
        }
    }
}
