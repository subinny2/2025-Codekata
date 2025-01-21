import java.util.ArrayList;
import java.util.Arrays;

/*
* 마지막 두 원소
* 정수 리스트 num_list가 주어질 때,
* 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
* 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return
* */
public class Codekata15 {
    static class Solution15 {
        public int[] solution15(int[] num_list) {
            ArrayList<Integer> answer = new ArrayList<>();
//            for (int num : num_list) {
//                answer.add(num);
//            }
            int len = num_list.length-1; // 마지막 인덱스
            int num = 0;
            // answer에 num_list배열의 원소를 추가한다.
            for(int i=0; i<num_list.length; i++){
                answer.add(num_list[i]);
            }
            
            // 조건에 따른 값을 추가
            if(num_list[len]>num_list[len-1]){ // 마지막 인덱스가 그전 인덱스보다 크기가 크면
                num = num_list[len] - num_list[len-1];
                answer.add(num);
            } else {
                answer.add(num_list[len]*2);
            }
            
            // ArrayList<Integer>를 int[]로 변환
            int[] an = answer.stream().mapToInt(i->i).toArray();
            return an;
        }

        public static void main(String[] args){
            Codekata15.Solution15 sol15 = new Codekata15.Solution15();
            int[] num_list = {2,1,6};
//            int[] num_list = {5,2,1,7,5};
            int[] result = sol15.solution15(num_list);
            System.out.println(Arrays.toString(result));
        }
    }
}
