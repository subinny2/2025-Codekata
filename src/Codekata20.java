import java.util.ArrayList;
/*
* 배열만들기
* 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
* 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
* 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
* */

public class Codekata20 {
    static class Solution20 {
        public int[] solution20(int l, int r) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=l; i<=r; i++){
                if(String.valueOf(i).matches("[05]+")){
                    list.add(i);
                }
            }
            if(list.isEmpty()){
                return new int[]{-1};
            }

            return list.stream().mapToInt(Integer::intValue).toArray();

            }

            /*
             * String.valueOf(i).matches("[05]+") 조건식을 사용하여 정수를 필터링
             * String.valueOf(i) : 정수 i를 문자열로 변환하여 반환하는 메서드
             * 그 문자열에 대해 matches 함수를 호출하여 정규식 패턴과 비교.
             * 정규식 해석
             * [] : 대괄호 안에는 문자클래스를 나타내는 문자들을 기술, 해당위치에 있는 문자중 하나를 의미
             * 05 : 0과 5 두개의 문자를 의미함
             * + : 바로앞에 있는문자 또는 문자클래스가 1번이상 반복되는 것을 의미
            */


        public static void main(String[] args){
            Codekata20.Solution20 sol20 = new Codekata20.Solution20();
            int[] result = sol20.solution20(5,555);
//            int[] result = sol20.solution20(10,20);
            System.out.println(result);

        }
    }
}
