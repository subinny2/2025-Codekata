/*
* 문자열 여러 번 뒤집기
* 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다.
* queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
* my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
* */
public class Codekata29 {
    static class Solution29 {
        public String solution29(String my_string, int[][] queries) {
            char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환

            // 각 반복에서는 쿼리의 시작 인덱스 start와 끝 인덱스 end를 가져옴
            for (int[] query : queries) { // queries배열을 for-each를 통해 순회
                int start = query[0];
                int end = query[1];

                // while 루프를 사용하여 start가 end보다 작을동안 반복
                // 루프의 각 반복에서는 arr[start]와 arr[end]의 값을 교환
                // 이를 위해 임시변수 temp을 사용하여 저장하고 교환 그리고 start를 증가 end을 감소
                while (start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;

                    start++;
                    end--;
                }
            }
            // arr을 new String(arr)을 사용하여 다시 문자열로 변환
            return new String(arr); // 문자 배열을 문자열로 변환하여 반환
        }

        public static void main(String[] args){
            Solution29 sol29 = new Solution29();
            int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
            String result = sol29.solution29("rermgorpsam", queries);
            System.out.println(result);
        }
    }
}
