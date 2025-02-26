import java.util.Arrays;

/*
* 리스트 자르기
* 정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다.
* slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
* */
public class Codekata45 {
    static class Solution45 {
        public int[] solution45(int n, int[] slicer, int[] num_list) {
            int[] answer = {};
            return answer;
        }

        public static void main(String[] args){
            Solution45 sol45 = new Solution45();
            int[] slicer = {1,5,2};
            int[] num_list = {1,2,3,4,5,6,7,8,9};
            int[] result = sol45.solution45(3,slicer, num_list);
            System.out.println(Arrays.toString(result));
        }
    }
}
